package com.devesuperior.dsvendas.repository;

import java.util.List;

import com.devesuperior.dsvendas.dto.SaleDTO;
import com.devesuperior.dsvendas.dto.SaleSuccessDTO;
import com.devesuperior.dsvendas.dto.SaleSumDTO;
import com.devesuperior.dsvendas.entities.Sale;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SaleRepository extends JpaRepository <Sale, Long> {

    @Query("SELECT new com.devesuperior.dsvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount))"
    +" FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSumDTO> amountGroupedBySeller();

    @Query("SELECT new com.devesuperior.dsvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals))"
    +" FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSuccessDTO> successGroupedBySeller();

}
