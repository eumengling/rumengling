package com.iotek.ssm.dao;

import java.util.List;

import com.iotek.ssm.entity.Department;

public interface DepartmentDao {

	//����
	public List<Department> queryAllDepartments();
	
	public int insertDepartment(Department dept);
	
	public int deleteDepartment(int id);
	
	public int updateDepartment(Department dept);
	
}
