package com.ktds.youtube.video.service;

import com.ktds.youtube.video.vo.GroupVideoListVO;
import com.ktds.youtube.video.vo.VideoVO;


public interface VideoService {

	public boolean createOneVideo(VideoVO videoVO);
	
	public boolean updateOneVideo(VideoVO videoVO);
	
	public boolean deleteOneVideo(String videoId);
	
	/**
	 * @param uploaderId 비디오를 조회한 회원의 아이디
	 * @param videoId
	 * @return
	 */
	public VideoVO readOneVideo(String uploaderId, String videoId);
	
	public GroupVideoListVO readAllVideo();
	
}
