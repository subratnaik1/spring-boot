package com.subrat.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
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
public class Hospital {
	@Id
	@SequenceGenerator(name="gen1",sequenceName = "bhhjh",initialValue = 100,allocationSize = 1)
	@GeneratedValue(generator ="gen1" ,strategy = GenerationType.SEQUENCE)
	private Long hospitalId;
	@NonNull
	private String hospitalName;
	@NonNull
	private String location;
	@OneToMany(targetEntity = Patient.class,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="HosId",referencedColumnName = "hospitalId")
	private List<Patient> patients;
	@Override
	public String toString() {
		return "Hospital [hospitalId=" + hospitalId + ", hospitalName=" + hospitalName + ", location=" + location
				+ ", patients=" + patients + "]";
	}
	
}
