package com.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.dto.BasketDto;
import com.dto.BasketPriceInfoDto;
import com.dto.BookDto;
import com.service.BasketManagerStrategy;
import com.service.imp.BasketServiceCall;
import com.service.imp.BasketServiceImp;
import com.service.imp.BasketServiceImpNotDb;
import lombok.Data;

@Data
@Controller
public class BasketController {
	
	
	private final BigDecimal shippingCost=new BigDecimal("20");
	private BasketDto basketDto;
	private BasketPriceInfoDto basketPriceInfoDto;
	List<BasketDto> basketList ;
	List<BasketDto> basketListTemp ;
	private boolean isBasketInDb ;
	private BasketServiceCall basketServiceCall=new BasketServiceCall(new BasketServiceImpNotDb()) ;
	private BasketServiceCall basketServiceCallDb=new BasketServiceCall(new BasketServiceImp()) ;
	
	
	public BasketController() {
		basketList=new ArrayList<BasketDto>();
		basketDto=new BasketDto();
		basketPriceInfoDto=new BasketPriceInfoDto();
	}
	
	
	

	//sepete ekle
	@PostMapping("/addBasket")
	public @ResponseBody ResponseEntity<String> post(@RequestParam BasketDto value) {
	    return new ResponseEntity<String>("POST Response", HttpStatus.OK);
	    
	}
	
	//sepeti list 
	@RequestMapping(value = "/allBasket", method = RequestMethod.POST)
	public ModelAndView displayAllBasket() {
		ModelAndView mv = new ModelAndView();
		
		if(!isBasketInDb) {
			callBasketDb();
		}
		callBasketPriceInfo();
		mv.addObject("basketList", basketList);
		mv.setViewName("allBasket");
		return mv;
	}
	
	
	private void callBasketPriceInfo() {
		BigDecimal subtotal=new BigDecimal(0);
		basketList.stream().forEach(f->{
			basketPriceInfoDto.setSubTotal(subtotal.add( f.getPrice().multiply(f.getPiece()) ));
		});
		
		basketPriceInfoDto.setKdvTax(subtotal.divide(new BigDecimal(0.18)));
		basketPriceInfoDto.setShippingCost(shippingCost);
		basketPriceInfoDto.setTotalAmount(basketPriceInfoDto.getSubTotal().add(basketPriceInfoDto.getKdvTax()).add(basketPriceInfoDto.getShippingCost()));
	}


	private void callBasketDb(){
		List<BasketDto> basketListTemp = basketServiceCallDb.getListBasket();
		basketListTemp.stream().filter(b->b.isCompleted()==true).collect(Collectors.toList() );
		if(basketListTemp.size()>0) {
			basketList.addAll(basketListTemp);
			
		}
		isBasketInDb=true;
		
	}
	
	// sepeti sil 
		@RequestMapping(value = "/deleteBasket", method = RequestMethod.POST)
	public ModelAndView deleteBasket() {
		ModelAndView mv = new ModelAndView();
		List<BasketDto> basketList = basketServiceCall.getListBasket();
		mv.addObject("basketList", basketList);
		mv.setViewName("allBasket");
		return mv;
	}







	
	
	

}
