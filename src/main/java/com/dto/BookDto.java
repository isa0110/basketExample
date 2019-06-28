package com.dto;

import java.math.BigDecimal;
import java.sql.Date;

import lombok.Data;

@Data
public class BookDto {

	private BigDecimal id;
	private BigDecimal bookId ;
	private String bookName;
	private BigDecimal price ;
	private String createdBy;
	private String updatedBy;
	private Date createdDate;
	private Date updatedDate ;

	
}
