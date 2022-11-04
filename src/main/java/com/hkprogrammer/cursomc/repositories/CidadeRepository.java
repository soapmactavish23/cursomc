package com.hkprogrammer.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hkprogrammer.cursomc.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}
