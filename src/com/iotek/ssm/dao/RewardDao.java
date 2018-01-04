package com.iotek.ssm.dao;

import java.util.List;

import com.iotek.ssm.entity.Reward;

public interface RewardDao {

	//½±³Í
	public List<Reward> queryAllRewards();
	
	public List<Reward> queryRewardByUserName(String name);
	
	public int insertReward(Reward reward);
	
	public int updateReward(Reward reward);
	
	public int deleteReward(int id);
	
}
