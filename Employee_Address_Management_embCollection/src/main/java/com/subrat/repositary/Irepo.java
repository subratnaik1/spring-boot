package com.subrat.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subrat.entity.Address;

public interface Irepo extends JpaRepository<Address, Long>{

}
