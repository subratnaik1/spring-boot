package com.subrat.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Setter
@Getter
public class Employee {
	@Id
	@SequenceGenerator(name="gen1",sequenceName = "emmm",initialValue = 100,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Long empId;
	@NonNull
	private String empName;
	@NonNull
	private String department;
	@ManyToMany(targetEntity = Project.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "project_id", joinColumns = @JoinColumn(name = "E_fk", referencedColumnName = "empId"), inverseJoinColumns = @JoinColumn(name = "p_fk", referencedColumnName = "projectId"))
	private List<Project> projects;

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", department=" + department +  "]";
	}

}
