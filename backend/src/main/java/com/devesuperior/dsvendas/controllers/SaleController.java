package com.devesuperior.dsvendas.controllers;

import java.util.List;

import com.devesuperior.dsvendas.dto.SaleDTO;
import com.devesuperior.dsvendas.dto.SaleSuccessDTO;
import com.devesuperior.dsvendas.dto.SaleSumDTO;
import com.devesuperior.dsvendas.service.SaleSevirce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
    
    @Autowired
    private SaleSevirce sevirce;

    @GetMapping
    public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
        Page<SaleDTO> page = sevirce.findAll(pageable);
        return ResponseEntity.ok(page);
    }

    @GetMapping(value = "/amount-by-seller")
    public ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller() {
        List<SaleSumDTO> list = sevirce.amountGroupedBySeller();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/success-by-seller")
    public ResponseEntity<List<SaleSuccessDTO>> succerssGroupedBySeller() {
        List<SaleSuccessDTO> list = sevirce.successGroupedBySeller();
        return ResponseEntity.ok(list);
    }

    
}
