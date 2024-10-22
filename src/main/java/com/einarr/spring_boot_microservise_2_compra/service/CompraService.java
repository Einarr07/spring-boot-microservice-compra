package com.einarr.spring_boot_microservise_2_compra.service;

import com.einarr.spring_boot_microservise_2_compra.model.Compra;

import java.util.List;

public interface CompraService {
    Compra saveCompra(Compra compra);

    List<Compra> findAllComprasOfUser(Long userId);
}
