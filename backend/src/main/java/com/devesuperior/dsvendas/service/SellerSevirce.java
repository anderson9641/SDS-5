package com.devesuperior.dsvendas.service;

import java.util.List;
import java.util.stream.Collectors;

import com.devesuperior.dsvendas.dto.SellerDTO;
import com.devesuperior.dsvendas.entities.Seller;
import com.devesuperior.dsvendas.repository.SellerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerSevirce {

    @Autowired
    private SellerRepository sellerRepository;

    public List<SellerDTO> findAll() {
        List<Seller> result = sellerRepository.findAll();
        return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
    }
}
