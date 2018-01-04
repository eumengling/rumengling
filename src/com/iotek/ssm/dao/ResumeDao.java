package com.iotek.ssm.dao;

import com.iotek.ssm.entity.Resume;

public interface ResumeDao {
	//¼òÀú
	public Resume queryResumeByUserId(int uid);
	
	public int insertResume(Resume resume);
	
	public int updateResume(Resume resume);
	
	public int deleteResume(int id);

}
