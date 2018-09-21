package com.ktds.youtube.uploader.biz;

import com.ktds.youtube.uploader.vo.UploaderVO;

public interface UploaderBiz {

	public boolean createNewUploader(UploaderVO uploaderVO);
	
	public UploaderVO readOneUploader(UploaderVO uploaderVO);
	
	public boolean updatePoint(String uploaderId, int point);
	
	public String readOneUploaderProfileImage(String uploaderId);
	
}
