package com.subrat.service;

import java.util.Optional;

import com.subrat.entity.FoodOrder;

public interface IFoodOrderService {
	String save(FoodOrder order);

	String saveAll(Iterable<FoodOrder> orders);

	Optional<FoodOrder> findOrderById(Long id);

	Iterable<FoodOrder> findAll();

	Iterable<FoodOrder> findAllById(Iterable<Long> ids);

	Boolean existsById(Long id);

	long count();

	String deleteById(Long id);

	String delete(FoodOrder order);

	String deleteAllById(Iterable<Long> ids);

	String deleteAll(Iterable<? extends FoodOrder> orders);
	
	String deleteAll();


}
