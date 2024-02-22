package com.example.entity;


import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="profile")
public class Profile {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String address;
	private Date dob;
	private String gender;  
	private String nationality;
	private String university;
	private String major;
	private int graduationYear;
	private String cgpa;
	private String project;

	private String resume;  // large object
	private String skills;
	private String certifications;
	
	 @OneToOne
	 @JoinColumn(name = "student_id")
	 private Student student;
}
