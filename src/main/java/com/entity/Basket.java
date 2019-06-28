package com.entity;

import java.math.BigDecimal;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.dto.BasketPriceInfoDto;

import lombok.Data;

@Data
@Entity
public class Basket {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private BigDecimal id;
	private BigDecimal basketId ;
	private BigDecimal bookId ;
	private BigDecimal price ;
	private BigDecimal piece ;
	private String createdBy;
	private String updatedBy;
	private Date createdDate;
	private Date updatedDate ;
	private boolean completed;
	
	
}
