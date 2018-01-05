package com.iotek.ssm.service;

import java.util.List;

import com.iotek.ssm.entity.Training;

public interface TrainingService {

	//≈‡—µ
	public List<Training> queryAllTrainings();
		
	public List<Training> queryTrainingByDepartment(int deptId);
		
	public List<Training> queryTrainingByPosition(int deptId,int posId);
		
	public Training queryTrainingByUserId(int userId);
			
	public int insertTraining(Training training);
			
	public int updateTraining(Training training);
			
	public int deleteTraining(int id);
	
}
