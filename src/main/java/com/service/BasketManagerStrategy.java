package com.service;

import java.util.List;

import com.dto.BasketDto;

public interface BasketManagerStrategy {
	
	 void saveBasket(BasketDto basketDto);
	 List<BasketDto> getListBasket();
	 void updateBasket(BasketDto basketDto);

}
