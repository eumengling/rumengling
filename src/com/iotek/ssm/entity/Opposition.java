package com.iotek.ssm.entity;

import java.util.Date;

public class Opposition {
	
	private int id;//异议工资表
	private int user_id;
	private Date salary_time;//有问题的工资月份
	private String remark;//原因
	
	public Opposition() {
		super();
	}

	public Opposition(int id, int user_id, Date salary_time, String remark) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.salary_time = salary_time;
		this.remark = remark;
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

	public Date getSalary_time() {
		return salary_time;
	}

	public void setSalary_time(Date salary_time) {
		this.salary_time = salary_time;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String toString() {
		return "Opposition [id=" + id + ", user_id=" + user_id + ", salary_time=" + salary_time + ", remark=" + remark
				+ "]";
	}
	
}
