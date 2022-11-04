package com.hkprogrammer.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hkprogrammer.cursomc.domain.Categoria;
import com.hkprogrammer.cursomc.domain.Cidade;
import com.hkprogrammer.cursomc.domain.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}
