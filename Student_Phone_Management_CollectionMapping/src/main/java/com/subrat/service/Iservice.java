package com.subrat.service;

import java.util.List;
import java.util.Optional;

import com.subrat.entity.Student;

public interface Iservice {

	List<Student> saveStudent(List<Student> s);

	Optional<Student> getStudentDetails(Long id);

}
