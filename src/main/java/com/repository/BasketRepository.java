package com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.entity.Basket;

@Repository
public interface BasketRepository extends CrudRepository<Basket, Long> {

}
