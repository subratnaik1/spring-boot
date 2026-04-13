package com.subrat.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.subrat.entity.Employee;

import jakarta.transaction.Transactional;

public interface Irepo extends JpaRepository<Employee, Long> {
	@Query("from Employee where department = :dept")
	List<Employee> findEmployeeByDepartment(String dept);

	@Query("from Employee where salary> :sal")
	List<Employee> findSalaryGreaterThen(Double sal);

	@Query("from Employee where name =:nm")
	List<Employee> searchByName(String nm);

	@Query("select count(*) from Employee where department =: dept")
	int countEmpInDept(String dept);

	@Query("from Employee where department=:dept and designation=:desg")
	List<Employee> findEmpByDesgDept(String desg, String dept);

	@Query(value = "from Employee where salary between :min and :max", nativeQuery = true)
	List<Employee> findEmpBetween(Double min, Double max);

	@Query(value = "select * from (select salary from Employee order by salary desc)where rownum<5", nativeQuery = true)
	List<Employee> findTopFive();

	@Query(value = "select count(*)from Employee", nativeQuery = true)
	int countEmp();

	@Query("select avg(salary) from Employee")
	int getAvgSal();

	@Query(value = "select count(*)from Employee where department =:dept", nativeQuery = true)
	int countByDept(String dept);

	@Transactional
	@Modifying
	@Query(value = "update Employee set salary =:sal where id =:id", nativeQuery = true)
	int UpdEmpSalById(Long id, Double sal);

	@Transactional
	@Modifying
	@Query(value = "update Employee set salary =:salary+5000 where department=:dept", nativeQuery = true)
	int incSalBy5000(String dept);
	
	@Transactional
	@Modifying
	@Query(value="delete from Employee where department =:dept",nativeQuery = true)
	int delBydept(String dept);
}
