package com.iotek.ssm.service;

import java.util.List;

import com.iotek.ssm.entity.Opposition;

public interface OppositionService {

	//“Ï“È
	public List<Opposition> queryAllOppositions();
	
	public int insertOpposition(Opposition opp);
	
	public int updateOpposition(Opposition opp);
	
	public int deleteOpposition(int id);
	
}
