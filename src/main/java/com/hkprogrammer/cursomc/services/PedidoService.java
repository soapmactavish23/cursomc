package com.hkprogrammer.cursomc.services;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.hkprogrammer.cursomc.domain.Cliente;
import com.hkprogrammer.cursomc.domain.ItemPedido;
import com.hkprogrammer.cursomc.domain.PagamentoComBoleto;
import com.hkprogrammer.cursomc.domain.Pedido;
import com.hkprogrammer.cursomc.domain.Produto;
import com.hkprogrammer.cursomc.domain.enums.EstadoPagamento;
import com.hkprogrammer.cursomc.repositories.ClienteRepository;
import com.hkprogrammer.cursomc.repositories.ItemPedidoRepository;
import com.hkprogrammer.cursomc.repositories.PagamentoRepository;
import com.hkprogrammer.cursomc.repositories.PedidoRepository;
import com.hkprogrammer.cursomc.repositories.ProdutoRepository;
import com.hkprogrammer.cursomc.security.UserSS;
import com.hkprogrammer.cursomc.services.exceptions.AuthorizationException;
import com.hkprogrammer.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;
	
	@Autowired
	private BoletoService boletoService;
	
	@Autowired
	private PagamentoRepository pagamentoRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private ItemPedidoRepository itemPedidoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private EmailService emailService;
	
	@Autowired
	private ClienteService clienteService;
	
	public Pedido find(Integer id) {
		Pedido pedido = repo.findById(id).orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! " + id + ", Tipo: " + Pedido.class.getName()));
		
		return pedido;
	}
	
	public Pedido insert(Pedido obj) {
		obj.setId(null);
		obj.setDate(new Date());
		obj.setCliente(clienteRepository.findById(obj.getCliente().getId()).get());
		obj.getPagamento().setEstado(EstadoPagamento.PENDENTE);
		obj.getPagamento().setPedido(obj);
		if(obj.getPagamento() instanceof PagamentoComBoleto) {
			PagamentoComBoleto pagto = (PagamentoComBoleto) obj.getPagamento();
			boletoService.preencherPagamentoComBoleto(pagto, obj.getDate());
		}
		obj = repo.save(obj);
		pagamentoRepository.save(obj.getPagamento());
		
		for(ItemPedido ip : obj.getItems()) {
			
			Integer idProduto = ip.getProduto().getId();
			Produto produto = produtoRepository.findById(idProduto).get();
			
			ip.setDesconto(0.0);
			ip.setProduto(produto);
			ip.setPreco(ip.getProduto().getPreco());
			ip.setPedido(obj);
			
		}
		
		itemPedidoRepository.saveAll(obj.getItems());
		emailService.sendOrderConfirmationEmail(obj);
		return obj;
	}
	
	public Page<Pedido> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
		
		UserSS user = UserService.authenticated();
		if(user == null) {
			throw new AuthorizationException("Acesso negado!");
		}
		
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		Cliente cliente = clienteService.find(user.getId());
		System.out.println(cliente);
		return repo.findByCliente(cliente, pageRequest);
		
	}
	
}
