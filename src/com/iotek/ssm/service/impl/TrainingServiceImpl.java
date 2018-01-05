package com.iotek.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotek.ssm.dao.TrainingDao;
import com.iotek.ssm.entity.Training;
import com.iotek.ssm.service.TrainingService;

@Service("trainingService")
public class TrainingServiceImpl implements TrainingService{

	@Autowired
	private TrainingDao tradao;
	
	public List<Training> queryAllTrainings() {
		return tradao.queryAllTrainings();
	}

	public List<Training> queryTrainingByDepartment(int deptId) {
		return tradao.queryTrainingByDepartment(deptId);
	}

	public List<Training> queryTrainingByPosition(int deptId, int posId) {
		return tradao.queryTrainingByPosition(deptId, posId);
	}

	public Training queryTrainingByUserId(int userId) {
		return tradao.queryTrainingByUserId(userId);
	}

	public int insertTraining(Training training) {
		return tradao.insertTraining(training);
	}

	public int updateTraining(Training training) {
		return tradao.updateTraining(training);
	}

	public int deleteTraining(int id) {
		return tradao.deleteTraining(id);
	}

}
