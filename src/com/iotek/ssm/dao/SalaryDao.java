package com.iotek.ssm.dao;

import java.util.List;

import com.iotek.ssm.entity.Salary;

public interface SalaryDao {

	//¹¤×Ê
	public List<Salary> querySalaryByNickname(String nickname);
	
	public int insertSalary(Salary salary);
	
	public int updateSalary(Salary salary);
	
}
