package com.hkprogrammer.cursomc.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hkprogrammer.cursomc.domain.Pedido;
import com.hkprogrammer.cursomc.repositories.PedidoRepository;
import com.hkprogrammer.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;
	
	public Pedido find(Integer id) {
		Pedido pedido = repo.findById(id).orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! " + id + ", Tipo: " + Pedido.class.getName()));
		
		return pedido;
	}
	
}
