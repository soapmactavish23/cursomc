package com.hkprogrammer.cursomc.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.hkprogrammer.cursomc.domain.Categoria;
import com.hkprogrammer.cursomc.repositories.CategoriaRepository;
import com.hkprogrammer.cursomc.services.exceptions.DataIntegrityException;
import com.hkprogrammer.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Categoria categoria = repo.findById(id).orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! " + id + ", Tipo: " + Categoria.class.getName()));
		
		return categoria;
	}
	
	public Categoria insert(Categoria obj) {
		obj.setId(null);
		return repo.save(obj);
	}
	
	public Categoria update(Categoria obj) {
		find(obj.getId());
		return repo.save(obj);
	}
	
	public void delete(Integer id) {
		find(id);
		try {
			repo.deleteById(id);
		} catch(DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é possível excluir uma categoria que possuí produtos");
		}
	}
	
}
