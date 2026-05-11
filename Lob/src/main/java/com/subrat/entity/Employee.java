package com.subrat.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="emp_info51")
public class Employee {
	@Id
	private Long emp_id;
	private String emp_name;
	private String department;
	private Double salary;
	@Lob
	private byte[] profile_photo;
	@Lob
	private String resume;

}
