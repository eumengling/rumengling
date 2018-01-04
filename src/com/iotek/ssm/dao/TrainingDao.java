package com.iotek.ssm.dao;

import java.util.List;

import com.iotek.ssm.entity.Training;

public interface TrainingDao {

	//≈‡—µ
	public List<Training> queryAllTrainings();
		
	public int insertTraining(Training training);
		
	public int updateTraining(Training training);
		
	public int deleteTraining(int id);
		
}
