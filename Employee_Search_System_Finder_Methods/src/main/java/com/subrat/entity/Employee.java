package com.subrat.entity;


import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="emp12")
public class Employee {
	@Id
	private int id;
	private String name;
	private String department;
	private int salary;
	private LocalDate joiningDate;
}
