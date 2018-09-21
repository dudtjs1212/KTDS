package com.ktds.youtube.video.vo;

import java.util.List;

public class GroupVideoVO {

	private String uploaderId;
	private List<VideoVO> videoList;

	public String getUploaderId() {
		return uploaderId;
	}

	public void setUploaderId(String uploaderId) {
		this.uploaderId = uploaderId;
	}

	public List<VideoVO> getVideoList() {
		return videoList;
	}

	public void setVideoList(List<VideoVO> videoList) {
		this.videoList = videoList;
	}

}
