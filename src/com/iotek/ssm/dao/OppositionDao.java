package com.iotek.ssm.dao;

import java.util.List;

import com.iotek.ssm.entity.Opposition;

public interface OppositionDao {

	//“Ï“È
	public List<Opposition> queryAllOppositions();
	
	public int insertOpposition(Opposition opp);
	
	public int updateOpposition(Opposition opp);
	
}
