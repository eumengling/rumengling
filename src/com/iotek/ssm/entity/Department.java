package com.iotek.ssm.entity;

import java.util.Date;

public class Department {
	
	private int id;//²¿ÃÅ
	private String name;
	private Date createtime;
	
	public Department() {
		super();
	}

	public Department(int id, String name, Date createtime) {
		super();
		this.id = id;
		this.name = name;
		this.createtime = createtime;
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

	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", createtime=" + createtime + "]";
	}

}
