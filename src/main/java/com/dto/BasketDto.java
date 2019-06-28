package com.dto;

import java.math.BigDecimal;
import java.sql.Date;

import lombok.Data;

@Data
public class BasketDto {

	private BigDecimal id;
	private BigDecimal basketId ;
	private BigDecimal bookId ;
	private BigDecimal price ; // kitabın fiyatı sonra değişebileceği için sepete eklendi . 
	private BigDecimal piece ; //adet
	private String createdBy;
	private String updatedBy;
	private Date createdDate;
	private Date updatedDate ;
	private boolean completed;
	
	
	
}
