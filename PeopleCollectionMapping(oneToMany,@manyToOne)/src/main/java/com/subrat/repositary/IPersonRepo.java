package com.subrat.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subrat.entity.Person;

public interface IPersonRepo extends JpaRepository<Person, Integer>{

}
