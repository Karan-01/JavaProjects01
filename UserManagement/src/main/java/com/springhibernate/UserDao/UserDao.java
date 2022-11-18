package com.springhibernate.UserDao;

import java.util.List;

import com.springhibernate.Entity.User;

public interface UserDao {
	
	public int insertUser(User us);

	public int updateUser(User us);

	public int deleteUser(User us);

	public User getUser(int u_id);

	public List<User> getAllUsers();

	public User getSpecificUserDetails(int uid);

}