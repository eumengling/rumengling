package com.iotek.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotek.ssm.dao.RewardDao;
import com.iotek.ssm.entity.Reward;
import com.iotek.ssm.service.RewardService;

@Service("rewardService")
public class RewardServiceImpl implements RewardService{

	@Autowired
	private RewardDao rewarddao;
	
	public List<Reward> queryAllRewards() {
		return rewarddao.queryAllRewards();
	}

	public List<Reward> queryRewardByUserName(String name) {
		return rewarddao.queryRewardByUserName(name);
	}

	public int insertReward(Reward reward) {
		return rewarddao.insertReward(reward);
	}

	public int updateReward(Reward reward) {
		return rewarddao.updateReward(reward);
	}

	public int deleteReward(int id) {
		return rewarddao.deleteReward(id);
	}

}
