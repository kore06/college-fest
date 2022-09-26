package com.greatlearning.college.service;

import java.util.List;

import com.greatlearning.college.entity.Student;

public interface StudentService {
	public List<Student> findAll();

	public Student findById(int theId);

	public void save(Student theStudent);

	public void deleteById(int theId);

	public List<Student> searchBy(String name, String country);

}
