package com.subrat.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subrat.entity.Passport;

public interface IPassportRepository extends JpaRepository<Passport, Long> {

}
