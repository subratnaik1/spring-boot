package com.subrat.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "studentJpa")
public class Student {
	
	@Id
	private Long id;
	
	private String name;

	private String course;

	private double marks;

	private String grade;

	private boolean passed;
	
	private String city;
}
