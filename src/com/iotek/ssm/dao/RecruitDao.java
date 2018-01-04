package com.iotek.ssm.dao;

import java.util.List;

import com.iotek.ssm.entity.Recruit;

public interface RecruitDao {

	//ÕÐÆ¸
	public List<Recruit> queryAllRecruits();
	
	public int insertRecruit(Recruit recruit);
	
	public int updateRecruit(Recruit recruit);
	
	public int deleteRecruit(int id);
	
}
