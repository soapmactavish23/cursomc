package com.hkprogrammer.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hkprogrammer.cursomc.domain.Pedido;
import com.hkprogrammer.cursomc.services.PedidoService;

@RestController
@RequestMapping("/pedidos")
public class PedidoResource {

	@Autowired
	private PedidoService service;
	
	@GetMapping("/{id}")
	public ResponseEntity<Pedido> find(@PathVariable Integer id) {
		System.out.println(id);
		Pedido obj = service.find(id);
		return ResponseEntity.ok(obj);
	}
	
}
