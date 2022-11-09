package com.hkprogrammer.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hkprogrammer.cursomc.domain.Cliente;
import com.hkprogrammer.cursomc.services.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteResource {

	@Autowired
	private ClienteService service;
	
	@GetMapping("/{id}")
	public ResponseEntity<Cliente> find(@PathVariable Integer id) {
		System.out.println(id);
		Cliente obj = service.find(id);
		return ResponseEntity.ok(obj);
	}
	
}
