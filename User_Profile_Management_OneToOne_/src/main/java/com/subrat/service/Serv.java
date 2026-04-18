package com.subrat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subrat.entity.Profile;
import com.subrat.entity.User;
import com.subrat.repositary.Iprofile;
import com.subrat.repositary.Iuser;

@Service
public class Serv implements Iservice {
	@Autowired
	private Iprofile iprofile;
	@Autowired
	private Iuser iuser;

	@Override
	public List<User> addUser(List<User> list) {
		
		return iuser.saveAll(list);
	}

	@Override
	public List<User> showAllUser() {
	
		return iuser.findAll();
	}

	@Override
	public int update(Long id, String name, String email, Profile profile) {
		
	
		return 0;
	}

}
