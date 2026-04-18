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
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@Setter
@Getter
@Table(name="User_tbl")
public class User {
	@Id
	@SequenceGenerator(name = "gen1",sequenceName = "a",initialValue = 100,allocationSize = 1)
	@GeneratedValue(generator="gen1",strategy = GenerationType.SEQUENCE)
	private Long id;
	@NonNull
	private String name;
	@NonNull
	private String email;
	@OneToOne(targetEntity = Profile.class,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="prof_id",referencedColumnName = "id")
	private Profile profile;
	@Override
	
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", profile=" + profile + "]";
	}
	
}
