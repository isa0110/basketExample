package com.entity;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Book {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private BigDecimal id;
	private BigDecimal bookId ;
	private String bookName;
	private BigDecimal price ;
	private String createdBy;
	private String updatedBy;
	private Date createdDate;
	private Date updatedDate ;

	
}
