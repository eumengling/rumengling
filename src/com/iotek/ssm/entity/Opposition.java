package com.iotek.ssm.entity;

public class Opposition {
	
	private int id;//异议工资表
	private int user_id;
	private int reward_id;//有问题的工资表编号
	private String remark;//原因
	
	public Opposition() {
		super();
	}

	public Opposition(int id, int user_id, int reward_id, String remark) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.reward_id = reward_id;
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

	public int getReward_id() {
		return reward_id;
	}

	public void setReward_id(int reward_id) {
		this.reward_id = reward_id;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String toString() {
		return "Opposition [id=" + id + ", user_id=" + user_id + ", reward_id=" + reward_id + ", remark=" + remark
				+ "]";
	}
	
}
