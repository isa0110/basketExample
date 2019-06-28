package com.service.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.dto.BasketDto;
import com.service.BasketManagerStrategy;

@Service
@Transactional
public class BasketServiceImpNotDb implements BasketManagerStrategy{

	@Override
	public void saveBasket(BasketDto basketDto) {
		
		
	}

	@Override
	public List<BasketDto> getListBasket() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateBasket(BasketDto basketDto) {
		// TODO Auto-generated method stub
		
	}

}
