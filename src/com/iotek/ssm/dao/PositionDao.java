package com.iotek.ssm.dao;

import java.util.List;

import com.iotek.ssm.entity.Position;

public interface PositionDao {
	
	//ְλ
	public List<Position> queryAllPositions();
	
	public Position queryPositionById(int posId);
	
	public int insertPosition(Position pos);
	
	public int deletePosition(int id);
	
	public int updatePosition(Position pos);
	
}
