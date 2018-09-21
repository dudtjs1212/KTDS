package com.ktds.youtube.uploader.service;

import com.ktds.youtube.uploader.vo.UploaderVO;

public interface UploaderService {

	public boolean createNewUploader(UploaderVO uploaderVO);
	
	public UploaderVO readOneUploader(UploaderVO uploaderVO);
	
	public String readOneUploaderProfileImage(String uploaderId);
}
