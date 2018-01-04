package com.iotek.ssm.entity;

public class Training {

	private int id;//培训
	private Department department;//部门
	private Position position;//职位
	private int user_id;
	private String item;//培训项目
	private String time;
	private String address;//地址
	
	public Training() {
		super();
	}

	public Training(int id, Department department, Position position, int user_id, String item, String time,
			String address) {
		super();
		this.id = id;
		this.department = department;
		this.position = position;
		this.user_id = user_id;
		this.item = item;
		this.time = time;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		return "Training [id=" + id + ", department=" + department + ", position=" + position + ", user_id=" + user_id
				+ ", item=" + item + ", time=" + time + ", address=" + address + "]";
	}

}
