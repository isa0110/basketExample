package com.service.imp;

import java.util.List;

import com.dto.BasketDto;
import com.service.BasketManagerStrategy;

public class BasketServiceCall {
	
	BasketManagerStrategy basketManagerStrategy;

	public BasketServiceCall(BasketManagerStrategy basketManagerStrategy) {
		
		this.basketManagerStrategy = basketManagerStrategy;
	}
	
	
	public void saveBasket(BasketDto basketDto) {
		basketManagerStrategy.saveBasket(basketDto);
		
	}

	
	public List<BasketDto> getListBasket() {
		
		return basketManagerStrategy.getListBasket();
	}

	
	public void updateBasket(BasketDto basketDto) {
		basketManagerStrategy.updateBasket(basketDto);
		
	}

}
