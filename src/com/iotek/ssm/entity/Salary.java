package com.iotek.ssm.entity;

import java.util.Date;

public class Salary {

	private int salary_id;//����
	private int user_id;
	private double wages;//�ܹ���
	private double base_pay;//��������
	private double merit_pay;//��Ч����
	private double overtime_pay;//�Ӱ๤��
	private double bonus;//����
	private double social_security;//�籣
	private double amount;//���
	private String reason;//ԭ��
	private Date time;
	
	public Salary() {
		super();
	}

	public Salary(int salary_id, int user_id, double wages, double base_pay, double merit_pay, double overtime_pay,
			double bonus, double social_security, double amount, String reason, Date time) {
		super();
		this.salary_id = salary_id;
		this.user_id = user_id;
		this.wages = wages;
		this.base_pay = base_pay;
		this.merit_pay = merit_pay;
		this.overtime_pay = overtime_pay;
		this.bonus = bonus;
		this.social_security = social_security;
		this.amount = amount;
		this.reason = reason;
		this.time = time;
	}

	public int getSalary_id() {
		return salary_id;
	}

	public void setSalary_id(int salary_id) {
		this.salary_id = salary_id;
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

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String toString() {
		return "Salary [salary_id=" + salary_id + ", user_id=" + user_id + ", wages=" + wages + ", base_pay=" + base_pay
				+ ", merit_pay=" + merit_pay + ", overtime_pay=" + overtime_pay + ", bonus=" + bonus
				+ ", social_security=" + social_security + ", amount=" + amount + ", reason=" + reason + ", time="
				+ time + "]";
	}
	
}
