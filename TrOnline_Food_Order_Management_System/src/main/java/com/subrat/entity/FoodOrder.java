package com.subrat.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="food")
@Data
public class FoodOrder {
    @Column(name="id")
	@Id
	private Long id;
    @Column(name="customerName")
	private String customerName;
    @Column(name="foodItem")
	private String foodItem;
    @Column(name="quantity")
	private Integer quantity;
    @Column(name="pricePerItem")
	private Double pricePerItem;
    @Column(name="totalAmount")
	private Double totalAmount;
}
