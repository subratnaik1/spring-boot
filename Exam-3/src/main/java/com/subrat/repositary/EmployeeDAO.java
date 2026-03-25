package com.subrat.repositary;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import com.subrat.sbeans.Employee;


@Repository("repo")
public class EmployeeDAO implements IEmployeeDAO {

	private DataSource ds;
	public static final String INSERT_emp = "INSERT INTO emp2 VALUES(?,?,?,?)";
	public static final String RETRIVE_emp = "SELECT * FROM emp2";
	public static final String Delete_emp = "DELETE FROM emp2 WHERE ID=?";

	@Override
	public int insertemp(Employee employee) throws Exception {
		int rowCount = 0;
		try (Connection con = ds.getConnection()) {
			PreparedStatement pstmt = con.prepareStatement(INSERT_emp);
			pstmt.setInt(1, employee.getId());
			pstmt.setString(2, employee.getName());
			pstmt.setString(3, employee.getDepartment());
			pstmt.setInt(4, employee.getSalary());
			rowCount = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowCount;
	}

	@Override
	public List<Employee> getAllemployee() throws Exception {
		List<Employee> list = new ArrayList<>();
		try (Connection con = ds.getConnection()) {
			PreparedStatement pstmt = con.prepareStatement(RETRIVE_emp);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Employee e = new Employee();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setDepartment(rs.getString(3));
				e.setSalary(rs.getInt(4));

				list.add(e);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int deleteEmp(int empId) throws Exception {

		int rowCount = 0;
		try (Connection con = ds.getConnection()) {
			PreparedStatement pstmt = con.prepareStatement(Delete_emp);
			pstmt.setInt(1, empId);
			rowCount = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();

		}

		return rowCount;
	}

}
