package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Profile;
import com.example.repository.ProfileRepository;

@Service
public class ProfileServiceImpl implements ProfileService{
	
	@Autowired
	private ProfileRepository profilerepository;
	
	
	@Override
	public Profile findByFirstName(String name) {
		// TODO Auto-generated method stub
		return profilerepository.findByFirstName(name);
	}


	public Profile save(Profile profile) {
		// TODO Auto-generated method stub
		return profilerepository.save(profile);
	}


	@Override
	public List<Profile> findAll() {
		// TODO Auto-generated method stub
		return profilerepository.findAll();
	}

}
