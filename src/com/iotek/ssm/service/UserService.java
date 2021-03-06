package com.iotek.ssm.service;

import java.util.List;

import com.iotek.ssm.entity.User;

public interface UserService {

	public List<User> queryAllUsers();
	
	public int insertUser(User user);
	
	public int deleteUser(int id);
	
	public User queryUserById(int id);
	
	public int updateUser(User user);
	
	public List<User> queryUserByName(String name);//�������ظ�
	
	public User queryUserByNickname(String nickname);
	
}
