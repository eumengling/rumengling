package com.iotek.ssm.service;

import java.util.List;

import com.iotek.ssm.entity.Position;

public interface PositionService {

	//ְλ
	public List<Position> queryAllPositions();
	
	public Position queryPositionById(int posId);
	
	public int insertPosition(Position posi);
	
	public int deletePosition(int id);
	
	public int updatePosition(Position posi);
	
}
