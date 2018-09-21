package com.ktds.youtube.video.biz;

import com.ktds.youtube.video.vo.GroupVideoListVO;
import com.ktds.youtube.video.vo.VideoVO;


public interface VideoBiz {

	public boolean createOneVideo(VideoVO videoVO);
	
	public boolean updateOneVideo(VideoVO videoVO);
	
	public boolean deleteOneVideo(String videoId);
	
	public VideoVO readOneVideo(String videoId);
	
	public GroupVideoListVO readAllVideo();
	
}
