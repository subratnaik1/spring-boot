package com.subrat.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subrat.entity.Customer;

public interface ICustomerRepository extends JpaRepository<Customer, Long> {

}
