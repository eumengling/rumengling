package com.iotek.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotek.ssm.dao.SalaryDao;
import com.iotek.ssm.entity.Salary;
import com.iotek.ssm.service.SalaryService;

@Service("salaryService")
public class SalaryServiceImpl implements SalaryService{
	
	@Autowired
	private SalaryDao salarydao;
	
	public List<Salary> querySalaryByNickname(String nickname) {
		return salarydao.querySalaryByNickname(nickname);
	}

	public int insertSalary(Salary salary) {
		return salarydao.insertSalary(salary);
	}

	public int updateSalary(Salary salary) {
		return salarydao.updateSalary(salary);
	}

}
