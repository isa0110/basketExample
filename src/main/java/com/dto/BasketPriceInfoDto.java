package com.dto;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class BasketPriceInfoDto {
	
	private BigDecimal id ;
	private BigDecimal basketId ;
	private BigDecimal subTotal;
	private BigDecimal kdvTax; 
    private BigDecimal shippingCost;
    private BigDecimal totalAmount;
	
	
}
