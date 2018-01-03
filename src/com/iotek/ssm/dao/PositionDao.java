package com.iotek.ssm.dao;

import java.util.List;

import com.iotek.ssm.entity.Position;

public interface PositionDao {
	
	//ְλ
	public List<Position> queryAllPositions();
	
	public int insertPosition(Position posi);
	
	public int deletePosition(int id);
	
	public int updatePosition(Position posi);
	
}
