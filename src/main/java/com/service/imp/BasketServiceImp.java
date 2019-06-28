package com.service.imp;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.config.HibernateConfig;
import com.dto.BasketDto;
import com.dto.BookDto;
import com.entity.Basket;
import com.entity.Book;
import com.repository.BasketRepository;
import com.service.BasketManagerStrategy;


@Service
@Transactional
public class BasketServiceImp implements BasketManagerStrategy{
	
	
	@Autowired
	private BasketRepository  basketRepository;
	@Autowired
	private HibernateConfig config;
	
	
	public BasketServiceImp() {
		
	}

	
	@Override
	public void saveBasket(BasketDto b) {
		
		basketRepository.save(config.modelMapper().map(b, Basket.class));
		
	}


	@Override
	public List<BasketDto> getListBasket() {
		
		 List<Basket> list=new ArrayList<Basket>();
		 basketRepository.findAll().forEach(b->list.add(b));
		 return  config.modelMapper().map(list, new TypeToken<List<BasketDto>>(){}.getType());
		
	}


	@Override
	public void updateBasket(BasketDto basketDto) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
