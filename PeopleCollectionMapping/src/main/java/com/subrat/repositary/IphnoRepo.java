package com.subrat.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subrat.entity.PhoneNumber;

public interface IphnoRepo extends JpaRepository<PhoneNumber, Integer>{
}
