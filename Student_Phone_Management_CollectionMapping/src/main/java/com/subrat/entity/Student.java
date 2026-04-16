package com.subrat.entity;

import java.util.List;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Data
@Table(name = "stu")
public class Student {
	@Id
	private Long id;
	@NonNull
	private String name;
	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name="phno_table",joinColumns =@JoinColumn(name="stud_id"))
	private List<Long> phoneNumbers;
}
