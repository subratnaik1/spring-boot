package com.subrat.repositary;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import com.subrat.entity.Student;

public interface Irepo extends JpaRepository<Student, Integer> {
	
	
}
