package com.iotek.ssm.service;

import java.util.List;

import com.iotek.ssm.entity.Recruit;

public interface RecruitService {

	//ÕÐÆ¸
	public List<Recruit> queryAllRecruits();
	
	public int insertRecruit(Recruit recruit);
	
	public int updateRecruit(Recruit recruit);
	
	public int deleteRecruit(int id);
	
}
