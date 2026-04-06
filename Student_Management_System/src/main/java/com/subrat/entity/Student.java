package com.subrat.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="student")
public class Student {
	@Id
	private long id;
	private String course;
	private double marks;
	private String grade;
	private boolean passed;
}
