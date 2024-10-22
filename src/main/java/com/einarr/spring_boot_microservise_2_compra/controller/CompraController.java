package com.einarr.spring_boot_microservise_2_compra.controller;

import com.einarr.spring_boot_microservise_2_compra.model.Compra;
import com.einarr.spring_boot_microservise_2_compra.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/compra")
public class CompraController {

    @Autowired
    private CompraService compraService;

    @PostMapping
    public ResponseEntity<?> saveCompra(@RequestBody Compra compra){
        return new ResponseEntity<>(
                compraService.saveCompra(compra),
                HttpStatus.CREATED
        );
    }

    @GetMapping("/{userId}")
    public ResponseEntity<List<Compra>> getAllComprasOfUser(@PathVariable Long userId){
        return ResponseEntity.ok(compraService.findAllComprasOfUser(userId));
    }
}
