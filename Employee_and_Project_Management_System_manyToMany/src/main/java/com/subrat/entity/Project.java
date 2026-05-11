package com.subrat.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class Project {
	@Id
	@SequenceGenerator(name="gen2",sequenceName = "pj",initialValue = 100,allocationSize = 1)
	@GeneratedValue(generator = "gen2",strategy = GenerationType.SEQUENCE)
	private Long projectId;
	@NonNull
	private String projectName;
	@NonNull
	private String clientName;
	@ManyToMany(targetEntity = Employee.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "projects")
	private List<Employee> employees;

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", clientName=" + clientName
				+  "]";
	}

}
