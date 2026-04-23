package com.subrat.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Table(name = "dep")
public class Department {
	@Id
	private Long id;
	@NonNull
	private String name;
	@NonNull
	private String location;
	@OneToMany(targetEntity = Employee.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "dept")
	private List<Employee> employee;

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", location=" + location + "]";
	}

}
