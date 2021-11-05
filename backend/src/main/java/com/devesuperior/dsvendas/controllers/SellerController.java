package com.devesuperior.dsvendas.controllers;

import java.util.List;

import com.devesuperior.dsvendas.dto.SellerDTO;
import com.devesuperior.dsvendas.service.SellerSevirce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/seller")
public class SellerController {
    
    @Autowired
    private SellerSevirce sevirce;

    @GetMapping
    public ResponseEntity<List<SellerDTO>> findAll() {
        List<SellerDTO> list = sevirce.findAll();
        return ResponseEntity.ok(list);
    }

    
}
