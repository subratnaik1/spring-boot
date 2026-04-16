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
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "phNo")
public class PhoneNumber {

	@Id
	@SequenceGenerator(name = "gen1", sequenceName = "reg_no_seq", initialValue = 1000, allocationSize = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	private Integer regno;
	@NonNull
	private Long mobileNo;
	@NonNull
	private String provider;
	@NonNull
	private String NumberType;
	@ManyToOne(targetEntity = Person.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "person_id", referencedColumnName = "pid")
	private Person personInfo;

	@Override
	public String toString() {
		return "PhoneNumber [regno=" + regno + ", mobileNo=" + mobileNo + ", provider=" + provider + ", NumberType="
				+ NumberType + "]";
	}

}
