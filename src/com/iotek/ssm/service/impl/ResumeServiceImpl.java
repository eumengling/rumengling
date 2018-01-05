package com.iotek.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iotek.ssm.dao.ResumeDao;
import com.iotek.ssm.entity.Resume;
import com.iotek.ssm.service.ResumeService;

@Service("resumeService")
public class ResumeServiceImpl implements ResumeService{

	@Autowired
	private ResumeDao resumedao;
	
	public Resume queryResumeByUserId(int uid) {
		return resumedao.queryResumeByUserId(uid);
	}

	public int insertResume(Resume resume) {
		return resumedao.insertResume(resume);
	}

	public int updateResume(Resume resume) {
		return resumedao.updateResume(resume);
	}

	public int deleteResume(int id) {
		return resumedao.deleteResume(id);
	}
	
}
