package com.ktds.youtube.video.vo;

import org.springframework.web.multipart.MultipartFile;

import com.ktds.youtube.uploader.vo.UploaderVO;

public class VideoVO {

	private String videoId;
	private String channelId;
	private String title;
	private String uploaderId;
	private int runningTime;
	private int viewCount;
	private String uploadDate;
	private String posterPath;
	private String videoPath;
	private String dateDiff;
	
	private UploaderVO uploaderVO;

	private MultipartFile video;
	private MultipartFile poster;

	public VideoVO() {
		this.posterPath = "";
		this.videoPath = "";
	}

	public String getVideoId() {
		return videoId;
	}

	public void setVideoId(String videoId) {
		this.videoId = videoId;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUploaderId() {
		return uploaderId;
	}

	public void setUploaderId(String uploaderId) {
		this.uploaderId = uploaderId;
	}

	public int getRunningTime() {
		return runningTime;
	}

	public void setRunningTime(int runningTime) {
		this.runningTime = runningTime;
	}

	public int getViewCount() {
		return viewCount;
	}

	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}

	public String getUploadDate() {
		return uploadDate;
	}

	public void setUploadDate(String uploadDate) {
		this.uploadDate = uploadDate;
	}

	public String getPosterPath() {
		return posterPath;
	}

	public void setPosterPath(String posterPath) {
		this.posterPath = posterPath;
	}

	public String getVideoPath() {
		return videoPath;
	}

	public void setVideoPath(String videoPath) {
		this.videoPath = videoPath;
	}

	public MultipartFile getVideo() {
		return video;
	}

	public void setVideo(MultipartFile video) {
		this.video = video;
	}

	public MultipartFile getPoster() {
		return poster;
	}

	public void setPoster(MultipartFile poster) {
		this.poster = poster;
	}

	public String getDateDiff() {
		return dateDiff;
	}

	public void setDateDiff(String dateDiff) {
		this.dateDiff = dateDiff;
	}

	public UploaderVO getUploaderVO() {
		return uploaderVO;
	}

	public void setUploaderVO(UploaderVO uploaderVO) {
		this.uploaderVO = uploaderVO;
	}

	
	
}
