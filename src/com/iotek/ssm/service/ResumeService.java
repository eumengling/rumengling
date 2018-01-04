package com.iotek.ssm.service;

import com.iotek.ssm.entity.Resume;

public interface ResumeService {

	//¼òÀú
	public Resume queryResumeByUserId(int uid);
		
	public int insertResume(Resume resume);
		
	public int updateResume(Resume resume);
	
	public int deleteResume(int id);
	
}
