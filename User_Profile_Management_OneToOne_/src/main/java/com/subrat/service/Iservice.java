package com.subrat.service;

import java.util.List;

import com.subrat.entity.Profile;
import com.subrat.entity.User;

public interface Iservice {

	List<User> addUser(List<User> list);

	List<User> showAllUser();
	
	int update(Long id,String name,String email,Profile profile);
}
