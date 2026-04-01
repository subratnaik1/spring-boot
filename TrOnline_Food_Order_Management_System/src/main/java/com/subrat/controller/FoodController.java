package com.subrat.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.subrat.entity.FoodOrder;
import com.subrat.service.IFoodOrderService;

@Controller
public class FoodController {
	
	@Autowired
	public IFoodOrderService iFoodOrderService;
	
	public String addOrder(FoodOrder fo) {				
		return iFoodOrderService.save(fo);
	}
	public String addMultipleOrders(Iterable<FoodOrder> orders) {	
		return 	iFoodOrderService.saveAll(orders);			
	}
	public Iterable<FoodOrder> findAll(){
		return iFoodOrderService.findAll();
	}
	public Optional<FoodOrder> viewOrdersById(Long id){
		return iFoodOrderService.findOrderById(id);
	}
	public Iterable<FoodOrder> viewOrdersByIds(Iterable<Long> ids){
		return iFoodOrderService.findAllById(ids);		
	}
	public Boolean checkOrderExists(Long id) {
		return iFoodOrderService.existsById(id);		
	}
	public long countOrders() {
		return iFoodOrderService.count();
	}	
	public String deleteOrderById(Long id){
		return iFoodOrderService.deleteById(id);		
	}	
	public String deleteOrdersByIds(Iterable<Long> ids) {
		return iFoodOrderService.deleteAllById(ids);
	}	
	public String deleteSpecificOrder(FoodOrder order) {
		return iFoodOrderService.delete(order);
	}	
	public String deleteAll(Iterable<? extends FoodOrder> orders) {
		return iFoodOrderService.deleteAll(orders);
	}	
	public String deleteAllOrders() {
		return iFoodOrderService.deleteAll();
	}
}
