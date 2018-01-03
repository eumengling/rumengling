package com.iotek.ssm.entity;

import java.util.Date;

public class Attendance {

	private int id;//���ڱ�
	private int user_id;
	private Date date;//����ʱ��
	private Date uppr_team;//�ϰ�ʱ��
	private Date subordinate_team;//�°�ʱ��
	private String crowded;//�Ƿ�ٵ�
	private String leave_rarly;//�Ƿ�����
	
	public Attendance() {
		super();
	}

	public Attendance(int id, int user_id, Date date, Date uppr_team, Date subordinate_team, String crowded,
			String leave_rarly) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.date = date;
		this.uppr_team = uppr_team;
		this.subordinate_team = subordinate_team;
		this.crowded = crowded;
		this.leave_rarly = leave_rarly;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getUppr_team() {
		return uppr_team;
	}

	public void setUppr_team(Date uppr_team) {
		this.uppr_team = uppr_team;
	}

	public Date getSubordinate_team() {
		return subordinate_team;
	}

	public void setSubordinate_team(Date subordinate_team) {
		this.subordinate_team = subordinate_team;
	}

	public String getCrowded() {
		return crowded;
	}

	public void setCrowded(String crowded) {
		this.crowded = crowded;
	}

	public String getLeave_rarly() {
		return leave_rarly;
	}

	public void setLeave_rarly(String leave_rarly) {
		this.leave_rarly = leave_rarly;
	}

	public String toString() {
		return "Attendance [id=" + id + ", user_id=" + user_id + ", date=" + date + ", uppr_team=" + uppr_team
				+ ", subordinate_team=" + subordinate_team + ", crowded=" + crowded + ", leave_rarly=" + leave_rarly
				+ "]";
	}
	
}
