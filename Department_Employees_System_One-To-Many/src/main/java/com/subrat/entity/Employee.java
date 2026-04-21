package com.subrat.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@RequiredArgsConstructor
@Table(name = "emp2")
public class Employee {
	@Id
	private long id;
	@NonNull
	private String name;
	@NonNull
	private Double salary;
	@NonNull
	private String designation;
	@ManyToOne(targetEntity = Department.class,fetch = FetchType.EAGER)
	@JoinColumn(name=" deptid",referencedColumnName = "id")
	private Department dept;
}
