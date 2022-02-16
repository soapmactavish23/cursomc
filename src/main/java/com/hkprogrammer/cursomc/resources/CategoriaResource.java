package com.hkprogrammer.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hkprogrammer.cursomc.domain.Categoria;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {

	@GetMapping
	public List<Categoria> listar() {
		List<Categoria> lista = new ArrayList<>();
		
		return lista;
	}
	
}
