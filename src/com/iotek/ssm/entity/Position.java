package com.iotek.ssm.entity;

import java.util.Date;

public class Position {
	
	private int id;//ְλ
	private String name;
	private Date createtime;
	
	private Department department;
	
	public Position() {
		super();
	}

	public Position(int id, String name, Date createtime, Department department) {
		super();
		this.id = id;
		this.name = name;
		this.createtime = createtime;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String toString() {
		return "Position [id=" + id + ", name=" + name + ", createtime=" + createtime + ", department=" + department
				+ "]";
	}
	
}
