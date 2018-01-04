package com.iotek.ssm.service;

import java.util.List;

import com.iotek.ssm.entity.Salary;

public interface SalaryService {

	//¹¤×Ê
	public List<Salary> querySalaryByNickname(String nickname);
	
	public int insertSalary(Salary salary);
	
	public int updateSalary(Salary salary);
	
}
