package com.subrat.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
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

public class Customer {
	@Id
	@SequenceGenerator(name = "gen2", sequenceName = "Jpa_cusid", initialValue = 100, allocationSize = 1)
	@GeneratedValue(generator = "gen2", strategy = GenerationType.SEQUENCE)
	private Long customerId;
	@NonNull
	private String customerName;
	@NonNull
	private String nationality;
	@OneToOne(targetEntity = Passport.class,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="pasport_id",referencedColumnName = "passportId")
	private Passport passport;

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", nationality=" + nationality
				+ ", passport=" + passport + "]";
	}

}
