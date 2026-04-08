package com.subrat.repositary;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.subrat.entity.Employee;

import jakarta.transaction.Transactional;

public interface Irepo extends JpaRepository<Employee, Long> {
	@Query("SELECT e FROM Employee e WHERE e.department = :dept")
	List<Employee> findByDept(String dept);

	@Query("SELECT e FROM Employee e WHERE e.salary BETWEEN :min AND :max")
	List<Employee> findEmpBetweenSal(int min, int max);

	@Query("SELECT e FROM Employee e WHERE e.experience > ?1")
	List<Employee> expGreater(int exp);

	@Query("SELECT COUNT(e) FROM Employee e WHERE e.department = :dept")
	int count(String dept);

	@Query("SELECT e FROM Employee e WHERE e.salary = (SELECT MAX(e.salary) FROM Employee e)")
	Optional<Employee> maxSal();

	@Query("Update Employee e set name= : name where id= : id")
	int updateEmp(String name, Long id);

	@Query("DELETE FROM Employee e WHERE e.id = :id")
	int delEmp(Long id);

	@Query("UPDATE Employee set salary=salary+(salary* ?1) where id= :id")
	@Modifying
	@Transactional
	int updateSal(Double inc,Long id );

	@Query("DELETE from Employee where salary= ?1")
	@Modifying
	@Transactional
	int delEmpSmallSal(Double sal);
}
