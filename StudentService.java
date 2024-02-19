package com.example.service;

import java.util.List;

import com.example.entity.Student;

public interface StudentService {
	List<Student> findAll();
	Student save(Student student);
}
