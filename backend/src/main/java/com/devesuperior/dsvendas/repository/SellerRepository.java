package com.devesuperior.dsvendas.repository;

import com.devesuperior.dsvendas.entities.Seller;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository <Seller, Long> {

}
