package com.iotek.ssm.entity;

import java.util.Date;

public class Reward {
	
	private int id;//½±³Í
	private double reward;//½±Àø
	private double penalties;//³Í·£
	private String reason;//Ô­Òò
	private Date time;
	
	public Reward() {
		super();
	}

	public Reward(int id, double reward, double penalties, String reason, Date time) {
		super();
		this.id = id;
		this.reward = reward;
		this.penalties = penalties;
		this.reason = reason;
		this.time = time;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getReward() {
		return reward;
	}

	public void setReward(double reward) {
		this.reward = reward;
	}

	public double getPenalties() {
		return penalties;
	}

	public void setPenalties(double penalties) {
		this.penalties = penalties;
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
		return "Reward [id=" + id + ", reward=" + reward + ", penalties=" + penalties + ", reason=" + reason + ", time="
				+ time + "]";
	}
	
}
