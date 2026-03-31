package com.subrat.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subrat.entity.FoodOrder;

public interface Repo extends JpaRepository<FoodOrder, Long>{

}
