package com.entity;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class BasketPriceInfo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private BigDecimal id ;
	
	@OneToOne
	private Basket basketId;
	private BigDecimal subTotal;
	private BigDecimal kdvTax; 
    private BigDecimal shippingCost;
    private BigDecimal totalAmount;
	
	
}
