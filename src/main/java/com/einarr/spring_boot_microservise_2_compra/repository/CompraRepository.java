package com.einarr.spring_boot_microservise_2_compra.repository;

import com.einarr.spring_boot_microservise_2_compra.model.Compra;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompraRepository extends JpaRepository<Compra, Long> {

    List<Compra> findAllByUserId(Long userId);
}
