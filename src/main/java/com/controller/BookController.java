package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dto.BasketDto;
import com.dto.BookDto;
import com.entity.Book;
import com.entity.User;
import com.service.BookService;
import com.service.imp.BasketServiceCall;
import com.service.imp.BasketServiceImpNotDb;

@Controller
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	private BasketServiceCall basketServiceCall=new BasketServiceCall(new BasketServiceImpNotDb()) ;
	
	
	
    
	
	@RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
	public ModelAndView home(HttpServletResponse response) throws IOException {
		ModelAndView mv = new ModelAndView();
		List<BookDto> bookList = bookService.getListBook();
		mv.addObject("bookList", bookList);
		mv.setViewName("home");
		
		return mv;
	}
	
	
	
	
	
	

}
