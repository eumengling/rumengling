package com.iotek.ssm.dao;

import java.util.List;

import com.iotek.ssm.entity.User;

public interface UserDao {

	public List<User> queryAllUsers();
	
	public int insertUser(User user);
	
	public int deleteUser(int id);
	
	public User queryUserById(int id);
	
	public int updateUser(User user);
	
	public List<User> queryUserByName(String name);//真名可重复
	
	public User queryUserByNickname(String nickname);
	
}
