package com.subrat.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
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
@RequiredArgsConstructor
@Setter
@Getter
@Table(name = "prof_tbl")
public class Profile {
	@Id
	@SequenceGenerator(name = "gen1", sequenceName = "a", initialValue = 100, allocationSize = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	private Long id;
	@NonNull
	private String phone;
	@NonNull
	private String address;

	@Override
	public String toString() {
		return "Profile [id=" + id + ", phone=" + phone + ", address=" + address + "]";
	}

}
