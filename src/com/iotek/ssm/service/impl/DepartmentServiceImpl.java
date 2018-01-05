package com.iotek.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotek.ssm.dao.DepartmentDao;
import com.iotek.ssm.entity.Department;
import com.iotek.ssm.service.DepartmentService;

@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	private DepartmentDao deptdao;
	
	public List<Department> queryAllDepartments() {
		return deptdao.queryAllDepartments();
	}

	public Department queryDepartmentById(int deptId) {
		return deptdao.queryDepartmentById(deptId);
	}

	public int insertDepartment(Department dept) {
		return deptdao.insertDepartment(dept);
	}

	public int deleteDepartment(int id) {
		return deptdao.deleteDepartment(id);
	}

	public int updateDepartment(Department dept) {
		return deptdao.updateDepartment(dept);
	}

}
