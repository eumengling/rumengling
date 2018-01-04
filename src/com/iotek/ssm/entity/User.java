package com.iotek.ssm.entity;

import java.util.Date;

public class User {

	private int id;//用户
	private String nickname;//昵称
	private String name;
	private String password;
	private String sex;
	private int age;
	private String degree;//学位
	private String tel;
	private String email;
	private Department department;//部门
	private Position position;//职位
	private String political_status;//政治面貌
	private Date hiredate;//入职时间
	private String hobby;//爱好
	private int type;//
	private String remark;//离职说明
	
	public User() {
		super();
	}

	public User(int id, String nickname, String name, String password, String sex, int age, String degree, String tel,
			String email, Department department, Position position, String political_status, Date hiredate,
			String hobby, int type, String remark) {
		super();
		this.id = id;
		this.nickname = nickname;
		this.name = name;
		this.password = password;
		this.sex = sex;
		this.age = age;
		this.degree = degree;
		this.tel = tel;
		this.email = email;
		this.department = department;
		this.position = position;
		this.political_status = political_status;
		this.hiredate = hiredate;
		this.hobby = hobby;
		this.type = type;
		this.remark = remark;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getPolitical_status() {
		return political_status;
	}

	public void setPolitical_status(String political_status) {
		this.political_status = political_status;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String toString() {
		return "User [id=" + id + ", nickname=" + nickname + ", name=" + name + ", password=" + password + ", sex="
				+ sex + ", age=" + age + ", degree=" + degree + ", tel=" + tel + ", email=" + email + ", department="
				+ department + ", position=" + position + ", political_status=" + political_status + ", hiredate="
				+ hiredate + ", hobby=" + hobby + ", type=" + type + ", remark=" + remark + "]";
	}
	
}
