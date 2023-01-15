package com.struts.dao;

import java.util.List;

import com.struts.models.User;

public interface UserDao {
	public int registerUser(User user);
	public int deleteUserDetails(Long id);
	public int updateUserDetails(User user);
	public User fetchUserDetails(Long id);
	public List<User> report();
}
