package com.subrat.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Travel_jpa")
@Data
public class Travel {

	@Column(name = "id")
	@Id
	private long id;
	@Column(name="destination")
	private String destination;
	@Column(name="transportationMode")
	private String transportationMode;
	@Column(name="price")
	private double price;

}
