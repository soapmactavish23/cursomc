package com.hkprogrammer.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hkprogrammer.cursomc.domain.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
