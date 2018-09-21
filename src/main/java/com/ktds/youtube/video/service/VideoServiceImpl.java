package com.ktds.youtube.video.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ktds.youtube.uploader.biz.UploaderBiz;
import com.ktds.youtube.video.biz.VideoBiz;
import com.ktds.youtube.video.vo.GroupVideoListVO;
import com.ktds.youtube.video.vo.VideoVO;

@Service
public class VideoServiceImpl implements VideoService {

	@Autowired
	private VideoBiz videoBiz;
	
	@Autowired
	private UploaderBiz uploaderBiz;

	@Override
	public boolean createOneVideo(VideoVO videoVO) {
		boolean isSuccess = videoBiz.createOneVideo(videoVO);
		// Insert 가 Fail 될 경우는 없기 때문에 조건이 필요가 없다. Error는 있을 수 있다.
		// 단, Select 후 Insert 할 경우엔 Select 할 때 false가 올 수 있다는 것을 명심하자.
		uploaderBiz.updatePoint(videoVO.getUploaderId(), 20);
		return isSuccess;
	}

	@Override
	public boolean updateOneVideo(VideoVO videoVO) {
		return videoBiz.updateOneVideo(videoVO);
	}

	@Override
	public boolean deleteOneVideo(String videoId) {
		return videoBiz.deleteOneVideo(videoId);
	}

	@Override
	public VideoVO readOneVideo(String uploaderId, String videoId) {
		uploaderBiz.updatePoint(uploaderId, -7);
		return videoBiz.readOneVideo(videoId);
	}

	@Override
	public GroupVideoListVO readAllVideo() {
		return videoBiz.readAllVideo();
	}
	
}
