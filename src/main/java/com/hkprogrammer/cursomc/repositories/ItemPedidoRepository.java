package com.hkprogrammer.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hkprogrammer.cursomc.domain.Categoria;
import com.hkprogrammer.cursomc.domain.ItemPedido;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer> {

}
