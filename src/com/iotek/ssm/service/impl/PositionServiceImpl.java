package com.iotek.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotek.ssm.dao.PositionDao;
import com.iotek.ssm.entity.Position;
import com.iotek.ssm.service.PositionService;

@Service("positionService")
public class PositionServiceImpl implements PositionService{

	@Autowired
	private PositionDao posdao;
	
	public List<Position> queryAllPositions() {
		return posdao.queryAllPositions();
	}

	public Position queryPositionById(int posId) {
		return posdao.queryPositionById(posId);
	}

	public int insertPosition(Position posi) {
		return posdao.insertPosition(posi);
	}

	public int deletePosition(int id) {
		return posdao.deletePosition(id);
	}

	public int updatePosition(Position posi) {
		return posdao.updatePosition(posi);
	}

}
