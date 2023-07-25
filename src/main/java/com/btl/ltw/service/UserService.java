package com.btl.ltw.service;

import java.util.List;

import com.btl.ltw.entity.User;

public interface UserService {
	
	List<User> getAllsExceptAdmin();
	
	User getUserByUsername(String username);
	
	User getAccount(String username, String password);
	
	boolean isExisted(User user);
	
	void save(User user);
	
	void delete(Integer user_id);
	
	void deleteUserIDFromUserRole(Integer user_id);
}
