package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Student;
import com.example.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentrepository;

	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return studentrepository.findAll();
	}

	@Override
	public Student save(Student student) {
		// TODO Auto-generated method stub
		return studentrepository.save(student);
	}

	

	
}
