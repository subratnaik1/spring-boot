package com.subrat.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subrat.entity.Hospital;

public interface IserviceHospital extends JpaRepository<Hospital, Long> {

}
