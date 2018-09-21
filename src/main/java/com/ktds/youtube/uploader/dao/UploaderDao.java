package com.ktds.youtube.uploader.dao;

import java.util.Map;

import com.ktds.youtube.uploader.vo.UploaderVO;

public interface UploaderDao {

	public int insertNewUploader(UploaderVO uploaderVO);
	
	public UploaderVO selectOneUploader(UploaderVO uploaderVO);
	
	public int updatePoint(Map<String, Object> param);
	
	public String selectOneUploaderProfileImage(String uploaderId);
	
}
