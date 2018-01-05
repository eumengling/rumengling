package com.iotek.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotek.ssm.dao.OppositionDao;
import com.iotek.ssm.entity.Opposition;
import com.iotek.ssm.service.OppositionService;

@Service("oppositionService")
public class OppositionServiceImpl implements OppositionService{

	@Autowired
	private OppositionDao oppdao;
	
	public List<Opposition> queryAllOppositions() {
		return oppdao.queryAllOppositions();
	}

	public int insertOpposition(Opposition opp) {
		return oppdao.insertOpposition(opp);
	}

	public int updateOpposition(Opposition opp) {
		return oppdao.updateOpposition(opp);
	}

	public int deleteOpposition(int id) {
		return oppdao.deleteOpposition(id);
	}

}
