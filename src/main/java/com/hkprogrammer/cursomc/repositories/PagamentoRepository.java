package com.hkprogrammer.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hkprogrammer.cursomc.domain.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

}
