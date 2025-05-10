package com.naren.dto;

public record TotalSalesDTO(String storeLocation, String itemName,int totalSales) {
    public TotalSalesDTO(String storeLocation,String itemName, int totalSales) {
        this.storeLocation = storeLocation;
        this.itemName = itemName;
        this.totalSales = totalSales;
    }
}
