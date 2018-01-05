package com.iotek.ssm.service;

import java.util.List;

import com.iotek.ssm.entity.Attendance;

public interface AttendanceService {

	//¿¼ÇÚ
	public List<Attendance> queryAllAttendances();
		
	public List<Attendance> queryAttendanceByUid(int userId);
		
	public List<Attendance> queryAttendanceByDepartment(int deptId);
		
	public List<Attendance> queryAttendanceByPosition(int posId);
		
	public int insertAttendance(Attendance attendance);
		
	public int updateAttendance(Attendance attendance);
	
}
