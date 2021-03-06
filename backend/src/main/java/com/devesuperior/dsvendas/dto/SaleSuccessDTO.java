package com.devesuperior.dsvendas.dto;

import java.io.Serializable;

import com.devesuperior.dsvendas.entities.Seller;

public class SaleSuccessDTO implements Serializable{
    
    private static final long serialVersionUID = 1L;

    private String sellerName;
    private Long visited;
    private Long deals;


    public SaleSuccessDTO() {
    }

    public SaleSuccessDTO(String sellerName, Long visited, Long deals) {
        this.sellerName = sellerName;
        this.setVisited(visited);
        this.setDeals(deals);
    }
    
    public SaleSuccessDTO(Seller seller, Long visited, Long deals) {
        sellerName = seller.getName();
        this.setVisited(visited);
        this.setDeals(deals);
    }

    public Long getDeals() {
        return deals;
    }

    public void setDeals(Long deals) {
        this.deals = deals;
    }

    public Long getVisited() {
        return visited;
    }

    public void setVisited(Long visited) {
        this.visited = visited;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    
}
