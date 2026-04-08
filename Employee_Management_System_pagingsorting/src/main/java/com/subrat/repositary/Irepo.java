package com.subrat.repositary;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.subrat.entity.Employee;

public interface Irepo extends CrudRepository<Employee, Long>,PagingAndSortingRepository<Employee, Long>{


}
