package com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.entity.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long>{

}
