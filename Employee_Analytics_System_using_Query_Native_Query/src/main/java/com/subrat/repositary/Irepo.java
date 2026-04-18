package com.subrat.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.subrat.entity.Student;

public interface Irepo extends JpaRepository<Student, Long> {
	@Query(value = "SELECT * FROM St WHERE course = :crs", nativeQuery = true)
	List<Student> findStudentByCourse(@Param("crs") String crs);

	@Query(value = "SELECT * FROM St WHERE marks > 90", nativeQuery = true)
	List<Student> studentMrkGreaterThen90();

	@Query(value = "SELECT AVG(marks) FROM St", nativeQuery = true)
	Double avgMarks();

	
}
