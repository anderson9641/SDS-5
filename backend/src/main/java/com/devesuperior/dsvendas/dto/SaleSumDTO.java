package com.devesuperior.dsvendas.dto;

import java.io.Serializable;

import com.devesuperior.dsvendas.entities.Seller;

public class SaleSumDTO implements Serializable{
    
    private static final long serialVersionUID = 1L;

    private String sellerName;
    private Double Sum;

    public SaleSumDTO() {
    }

    public Double getSum() {
        return Sum;
    }

    public void setSum(Double sum) {
        this.Sum = sum;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public SaleSumDTO(Seller seller, Double Sum) {
        this.setSellerName(seller.getName());
        this.setSum(Sum);
    }

    
}
