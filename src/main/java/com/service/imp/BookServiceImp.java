package com.service.imp;


import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.config.HibernateConfig;
import com.dto.BookDto;
import com.entity.Book;
import com.repository.BookRepository;
import com.service.BookService;


@Service
@Transactional
public class BookServiceImp implements BookService{

	
	@Autowired
	private BookRepository bookRepository;
	@Autowired
	private HibernateConfig config;
	
	
	@Override
	public List<BookDto> getListBook() {
		
		 List<Book> list=new ArrayList<Book>();
		 bookRepository.findAll().forEach(b->list.add(b));
		 return  config.modelMapper().map(list, new TypeToken<List<BookDto>>(){}.getType());
		
		
	}

}
