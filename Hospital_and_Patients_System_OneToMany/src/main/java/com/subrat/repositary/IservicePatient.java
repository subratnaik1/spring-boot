package com.subrat.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subrat.entity.Patient;

public interface IservicePatient extends JpaRepository<Patient, Long> {

}
