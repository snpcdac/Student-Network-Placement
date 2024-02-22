package com.example.service;

import java.util.List;

import com.example.entity.Profile;

public interface ProfileService {
	Profile findByFirstName(String name);
	List<Profile> findAll();
	Profile save(Profile profile);
}
