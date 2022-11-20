package com.hkprogrammer.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hkprogrammer.cursomc.domain.Categoria;
import com.hkprogrammer.cursomc.domain.Produto;
import com.hkprogrammer.cursomc.dto.CategoriaDTO;
import com.hkprogrammer.cursomc.dto.ProdutoDTO;
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
	
	@GetMapping("/page")
	public ResponseEntity<Page<ProdutoDTO>> findPage(
			@RequestParam(defaultValue = "") String nome,
			@RequestParam(defaultValue = "") Integer categorias,
			@RequestParam(defaultValue = "0") Integer page,
			@RequestParam(defaultValue = "24") Integer linesPerPage,
			@RequestParam(defaultValue = "nome") String orderBy,
			@RequestParam(defaultValue = "ASC") String direction) {
		Page<Categoria> list = service.findPage(page, linesPerPage, orderBy, direction);
		Page<CategoriaDTO> listDTO = list.map(obj -> new CategoriaDTO(obj));
		return ResponseEntity.ok(listDTO);
	}
	
}
