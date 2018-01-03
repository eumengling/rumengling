package com.iotek.ssm.entity;

import java.util.Date;

public class Department {
	
	private int id;//≤ø√≈
	private String name;
	private Date createtime;
	
	private Position position;

	public Department() {
		super();
	}

	public Department(int id, String name, Date createtime, Position position) {
		super();
		this.id = id;
		this.name = name;
		this.createtime = createtime;
		this.position = position;
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

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", createtime=" + createtime + ", position=" + position
				+ "]";
	}
	
}
