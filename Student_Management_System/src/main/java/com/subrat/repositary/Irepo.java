package com.subrat.repositary;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subrat.entity.Student;

public interface Irepo extends JpaRepository<Student, Long>{

	List<Student> findByCourse(String course);

	List<Student> findByMarksGreaterThan(Double marks);

	List<Student> findByMarksBetween(Double min, Double max);

	List<Student> findByGrade(String grade);

	List<Student> findByCity(String city);

	List<Student> findByPassedTrue();

	List<Student> findByNameStartingWith(String prefix);

	List<Student> findByCourseAndPassed(String course, Boolean status);

	List<Student> findTop3ByOrderByMarksDesc();

	List<Student> findByCityNotIn(List<String> cities);

	
}
