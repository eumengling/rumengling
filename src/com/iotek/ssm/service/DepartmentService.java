package com.iotek.ssm.service;

import java.util.List;

import com.iotek.ssm.entity.Department;

public interface DepartmentService {

	//²¿ÃÅ
	public List<Department> queryAllDepartments();
	
	public Department queryDepartmentById(int deptId);
		
	public int insertDepartment(Department dept);
		
	public int deleteDepartment(int id);
		
	public int updateDepartment(Department dept);
	
}
