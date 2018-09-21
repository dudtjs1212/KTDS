package com.ktds.youtube.uploader.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ktds.youtube.uploader.biz.UploaderBiz;
import com.ktds.youtube.uploader.vo.UploaderVO;

@Service
public class UploaderServiceImpl implements UploaderService {

	@Autowired
	private UploaderBiz uploaderBiz;
	
	@Override
	public boolean createNewUploader(UploaderVO uploaderVO) {
		return uploaderBiz.createNewUploader(uploaderVO);
	}

	@Override
	public UploaderVO readOneUploader(UploaderVO uploaderVO) {
		return uploaderBiz.readOneUploader(uploaderVO);
	}

	@Override
	public String readOneUploaderProfileImage(String uploaderId) {
		return uploaderBiz.readOneUploaderProfileImage(uploaderId);
	}

}
