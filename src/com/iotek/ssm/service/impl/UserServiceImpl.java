package com.iotek.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotek.ssm.dao.UserDao;
import com.iotek.ssm.entity.User;
import com.iotek.ssm.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userdao;
	
	public List<User> queryAllUsers() {
		return userdao.queryAllUsers();
	}

	public int insertUser(User user) {
		/*Department dept = deptdao.queryDepartmentById(deptId);
		user.setDepartment(dept);
		Position pos = posdao.queryPositionById(posId);
		user.setPosition(pos);
		user.setHiredate(new Date());//入职时间
		*/		
		return userdao.insertUser(user);
	}

	public int deleteUser(int id) {
		return userdao.deleteUser(id);
	}

	public User queryUserById(int id) {
		return userdao.queryUserById(id);
	}

	public int updateUser(User user) {
		return userdao.updateUser(user);
	}

	public List<User> queryUserByName(String name) {
		return userdao.queryUserByName(name);
	}

	public User queryUserByNickname(String nickname) {
		return userdao.queryUserByNickname(nickname);
	}

}
