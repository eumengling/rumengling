package com.iotek.ssm.entity;

public class Resume {
	
	private int resume_id;//简历
	private int user_id;
	private String name;
	private String sex;
	private int age;
	private String degree;//学位
	private String tel;
	private String email;
	private Department department;//部门
	private Position position;//职位
	private String salary_expectation;//期望薪资
	private String work_experience;//工作经验
	private String previous_job;//上一份工作
	private String political_status;//政治面貌
	private String hobby;//爱好
	
	public Resume() {
		super();
	}

	public Resume(int resume_id, int user_id, String name, String sex, int age, String degree, String tel, String email,
			Department department, Position position, String salary_expectation, String work_experience,
			String previous_job, String political_status, String hobby) {
		super();
		this.resume_id = resume_id;
		this.user_id = user_id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.degree = degree;
		this.tel = tel;
		this.email = email;
		this.department = department;
		this.position = position;
		this.salary_expectation = salary_expectation;
		this.work_experience = work_experience;
		this.previous_job = previous_job;
		this.political_status = political_status;
		this.hobby = hobby;
	}

	public int getResume_id() {
		return resume_id;
	}

	public void setResume_id(int resume_id) {
		this.resume_id = resume_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getSalary_expectation() {
		return salary_expectation;
	}

	public void setSalary_expectation(String salary_expectation) {
		this.salary_expectation = salary_expectation;
	}

	public String getWork_experience() {
		return work_experience;
	}

	public void setWork_experience(String work_experience) {
		this.work_experience = work_experience;
	}

	public String getPrevious_job() {
		return previous_job;
	}

	public void setPrevious_job(String previous_job) {
		this.previous_job = previous_job;
	}

	public String getPolitical_status() {
		return political_status;
	}

	public void setPolitical_status(String political_status) {
		this.political_status = political_status;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String toString() {
		return "Resume [resume_id=" + resume_id + ", user_id=" + user_id + ", name=" + name + ", sex=" + sex + ", age="
				+ age + ", degree=" + degree + ", tel=" + tel + ", email=" + email + ", department=" + department
				+ ", position=" + position + ", salary_expectation=" + salary_expectation + ", work_experience="
				+ work_experience + ", previous_job=" + previous_job + ", political_status=" + political_status
				+ ", hobby=" + hobby + "]";
	}
	
}
