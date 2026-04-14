package com.subrat.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Table(name = "marraigeSeeker")
public class MarraigeSeeker implements Serializable{
	@Id
	private Long id;
	@NonNull
	private String name;
	@NonNull
	private String address;
	@NonNull
	@Lob
	private byte[] photo;
	@NonNull
	@Lob
	private char[] resume;
}
