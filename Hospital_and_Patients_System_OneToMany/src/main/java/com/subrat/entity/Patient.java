package com.subrat.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class Patient {
	@Id
	@SequenceGenerator(name = "gen2", sequenceName = "jpa_2", initialValue = 100, allocationSize = 1)
	@GeneratedValue(generator = "gen2", strategy = GenerationType.SEQUENCE)
	private Long patientId;
	@NonNull
	private String patientName;
	@NonNull
	private String disease;
	@NonNull
	private Double billAmount;
	@ManyToOne(targetEntity = Hospital.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "patId", referencedColumnName = "hospitalId")
	private Hospital hospital;

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", disease=" + disease
				+ ", billAmount=" + billAmount +  "]";
	}

}
