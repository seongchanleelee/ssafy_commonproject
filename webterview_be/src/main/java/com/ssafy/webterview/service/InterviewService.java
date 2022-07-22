package com.ssafy.webterview.service;

import java.util.List;

import com.ssafy.webterview.dto.Applicant;

public interface InterviewService {
	//본인확인, 알람부분 없음
	
	public Applicant saveApplicant();
	
	public Applicant modifyApplicant();
	
	public Applicant getApplicant();
	
	public int deleteApplicant();
	
	public List<Applicant> listApplicant();
}
