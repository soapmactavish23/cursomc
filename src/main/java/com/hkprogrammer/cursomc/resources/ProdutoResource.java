package com.hkprogrammer.cursomc.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hkprogrammer.cursomc.domain.Produto;
import com.hkprogrammer.cursomc.dto.ProdutoDTO;
import com.hkprogrammer.cursomc.resources.utils.URL;
import com.hkprogrammer.cursomc.services.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoResource {

	@Autowired
	private ProdutoService service;
	
	@GetMapping("/{id}")
	public ResponseEntity<Produto> find(@PathVariable Integer id) {
		System.out.println(id);
		Produto obj = service.find(id);
		return ResponseEntity.ok(obj);
	}
	
	@GetMapping
	public ResponseEntity<Page<ProdutoDTO>> findPage(
			@RequestParam(defaultValue = "") String nome,
			@RequestParam(defaultValue = "") String categorias,
			@RequestParam(defaultValue = "0") Integer page,
			@RequestParam(defaultValue = "24") Integer linesPerPage,
			@RequestParam(defaultValue = "nome") String orderBy,
			@RequestParam(defaultValue = "ASC") String direction) {
		
		String nomeDecode = URL.decodeParam(nome);
		List<Integer> ids = URL.decodeIntList(categorias);
		
		Page<Produto> list = service.search(nomeDecode, ids, page, linesPerPage, orderBy, direction);
		Page<ProdutoDTO> listDTO = list.map(obj -> new ProdutoDTO(obj));
		return ResponseEntity.ok(listDTO);
	}
	
}
