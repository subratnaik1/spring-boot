package com.subrat.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subrat.entity.User;

public interface Iuser extends JpaRepository<User, Long> {

}
