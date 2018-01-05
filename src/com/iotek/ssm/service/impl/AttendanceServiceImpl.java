package com.iotek.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotek.ssm.dao.AttendanceDao;
import com.iotek.ssm.entity.Attendance;
import com.iotek.ssm.service.AttendanceService;

@Service("attendanceService")
public class AttendanceServiceImpl implements AttendanceService{

	@Autowired
	private AttendanceDao attdao;
	
	public List<Attendance> queryAllAttendances() {
		return attdao.queryAllAttendances();
	}

	public List<Attendance> queryAttendanceByUid(int userId) {
		return attdao.queryAttendanceByUid(userId);
	}

	public List<Attendance> queryAttendanceByDepartment(int deptId) {
		return attdao.queryAttendanceByDepartment(deptId);
	}

	public List<Attendance> queryAttendanceByPosition(int posId) {
		return attdao.queryAttendanceByPosition(posId);
	}

	public int insertAttendance(Attendance attendance) {
		return attdao.insertAttendance(attendance);
	}

	public int updateAttendance(Attendance attendance) {
		return attdao.updateAttendance(attendance);
	}

}
