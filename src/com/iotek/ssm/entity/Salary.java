package com.iotek.ssm.entity;

import java.util.Date;

public class Salary {

	private int id;//工资
	private int user_id;
	private double wages;//总工资
	private double base_pay;//基本工资
	private double merit_pay;//绩效工资
	private double overtime_pay;//加班工资
	private double bonus;//奖金
	private double social_security;//社保
	private Date time;
	
	public Salary() {
		super();
	}

	public Salary(int id, int user_id, double wages, double base_pay, double merit_pay, double overtime_pay,
			double bonus, double social_security, Date time) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.wages = wages;
		this.base_pay = base_pay;
		this.merit_pay = merit_pay;
		this.overtime_pay = overtime_pay;
		this.bonus = bonus;
		this.social_security = social_security;
		this.time = time;
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

	public double getWages() {
		return wages;
	}

	public void setWages(double wages) {
		this.wages = wages;
	}

	public double getBase_pay() {
		return base_pay;
	}

	public void setBase_pay(double base_pay) {
		this.base_pay = base_pay;
	}

	public double getMerit_pay() {
		return merit_pay;
	}

	public void setMerit_pay(double merit_pay) {
		this.merit_pay = merit_pay;
	}

	public double getOvertime_pay() {
		return overtime_pay;
	}

	public void setOvertime_pay(double overtime_pay) {
		this.overtime_pay = overtime_pay;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getSocial_security() {
		return social_security;
	}

	public void setSocial_security(double social_security) {
		this.social_security = social_security;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String toString() {
		return "Salary [id=" + id + ", user_id=" + user_id + ", wages=" + wages + ", base_pay=" + base_pay
				+ ", merit_pay=" + merit_pay + ", overtime_pay=" + overtime_pay + ", bonus=" + bonus
				+ ", social_security=" + social_security + ", time=" + time + "]";
	}
	
}
