package com.subrat.repositary;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subrat.entity.Student;

public interface Irepo extends JpaRepository<Student, Long>{

	Optional<String> findByCourse(String course);

	List<String> findByMarksGreaterThan(Double marks);

	List<String> findByMarksBetween(Double min, Double max);

	List<String> findByGrade(String grade);

	Optional<String> findByCity(String city);

	boolean findByPassedTrue();

	Optional<String> findByNameStartingWith(String prefix);

	Optional<String> findByCourseAndPassed(String course, Boolean status);

	List<String> findTop3ByOrderByMarksDesc();

	List<String> findByCityNotIn(List<String> cities);

}
