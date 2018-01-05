package com.iotek.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotek.ssm.dao.RecruitDao;
import com.iotek.ssm.entity.Recruit;
import com.iotek.ssm.service.RecruitService;

@Service("recruitService")
public class RecruitServiceImpl implements RecruitService{
	
	@Autowired
	private RecruitDao recdao;
	
	public List<Recruit> queryAllRecruits() {
		return recdao.queryAllRecruits();
	}

	public int insertRecruit(Recruit recruit) {
		return recdao.insertRecruit(recruit);
	}

	public int updateRecruit(Recruit recruit) {
		return recdao.updateRecruit(recruit);
	}

	public int deleteRecruit(int id) {
		return recdao.deleteRecruit(id);
	}

}
