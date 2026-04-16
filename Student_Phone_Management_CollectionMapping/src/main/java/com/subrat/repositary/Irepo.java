package com.subrat.repositary;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subrat.entity.Student;

public interface Irepo extends JpaRepository<Student, Long>{
	
}
