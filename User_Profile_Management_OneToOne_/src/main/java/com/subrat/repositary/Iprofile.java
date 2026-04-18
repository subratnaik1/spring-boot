package com.subrat.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subrat.entity.Profile;

public interface Iprofile extends JpaRepository<Profile, Long> {

}
