package com.subrat.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subrat.entity.FoodOrder;
import com.subrat.repositary.Repo;

@Service
public class FoodOrderService implements IFoodOrderService {
	@Autowired
	public Repo rep;
	
	@Override
	public String save(FoodOrder order) {

		order.setTotalAmount(order.getQuantity()*order.getPricePerItem());
		if(order.getQuantity()>5) {
			order.setTotalAmount(order.getTotalAmount()-order.getTotalAmount()*0.10);
		}
		if(order.getTotalAmount()>1000){
			order.setTotalAmount(order.getTotalAmount()+100);
		}
		if(order.getQuantity()>0 && order.getPricePerItem()>0) {
			rep.save(order);
		}
		return "food order saved";
	}

	@Override
	public String saveAll(Iterable<FoodOrder> orders) {
		
		rep.saveAll(orders);
		return "all orders saved";
	}

	@Override
	public Optional<FoodOrder> findOrderById(Long id) {
		return rep.findById(id);			
	}

	@Override
	public Iterable<FoodOrder> findAll() {
		
		return rep.findAll();
	}

	@Override
	public Iterable<FoodOrder> findAllById(Iterable<Long> ids) {

		return rep.findAllById(ids);
	}

	@Override
	public Boolean existsById(Long id) {
		
		return rep.existsById(id);
	}

	@Override
	public long count() {

		return rep.count();
	}

	@Override
	public String deleteById(Long id) {

		 rep.deleteById(id);
		 return "deleted the order of id "+id;
	}

	@Override
	public String delete(FoodOrder order) {
		rep.delete(order);

		return "order deleted";
	}

	@Override
	public String deleteAllById(Iterable<Long> ids) {
		rep.deleteAllById(ids);
		return "deleted";
	}

	@Override
	public String deleteAll(Iterable<? extends FoodOrder> orders) {
		rep.deleteAll(orders);
		return "delete";
	}

	@Override
	public String deleteAll() {
		rep.deleteAll();
		
		return "deleted";
	}

}
