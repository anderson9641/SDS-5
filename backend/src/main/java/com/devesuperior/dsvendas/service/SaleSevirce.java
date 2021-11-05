package com.devesuperior.dsvendas.service;

import java.util.List;
import java.util.stream.Collectors;

import com.devesuperior.dsvendas.dto.SaleDTO;
import com.devesuperior.dsvendas.dto.SaleSuccessDTO;
import com.devesuperior.dsvendas.dto.SaleSumDTO;
import com.devesuperior.dsvendas.entities.Sale;

import com.devesuperior.dsvendas.repository.SaleRepository;
import com.devesuperior.dsvendas.repository.SellerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SaleSevirce {

    @Autowired
    private SaleRepository saleRepository;
    @Autowired
    private SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable) {
        sellerRepository.findAll();
        Page<Sale> result = saleRepository.findAll(pageable);
        return result.map(x -> new SaleDTO(x));
    }

    @Transactional(readOnly = true)
    public List<SaleSumDTO> amountGroupedBySeller(){
        return saleRepository.amountGroupedBySeller();
    }

    @Transactional(readOnly = true)
    public List<SaleSuccessDTO> successGroupedBySeller(){
        return saleRepository.successGroupedBySeller();
    }
}
