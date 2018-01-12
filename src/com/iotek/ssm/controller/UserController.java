package com.iotek.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iotek.ssm.service.AttendanceService;
import com.iotek.ssm.service.DepartmentService;
import com.iotek.ssm.service.OppositionService;
import com.iotek.ssm.service.PositionService;
import com.iotek.ssm.service.RecruitService;
import com.iotek.ssm.service.ResumeService;
import com.iotek.ssm.service.SalaryService;
import com.iotek.ssm.service.TrainingService;
import com.iotek.ssm.service.UserService;

@RequestMapping("user")
@Controller
public class UserController {

	@Autowired
	private UserService userService;
	@Autowired
	private ResumeService resumeService;
	@Autowired
	private DepartmentService deptService;
	@Autowired
	private PositionService posService;
	@Autowired
	private SalaryService salaryService;
	@Autowired
	private OppositionService oppService;
	@Autowired
	private RecruitService recruitService;
	@Autowired
	private TrainingService traService;
	@Autowired
	private AttendanceService attService;
	
	
	
}
