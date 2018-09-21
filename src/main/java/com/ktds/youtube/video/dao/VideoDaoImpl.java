package com.ktds.youtube.video.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ktds.youtube.video.biz.VideoBiz;
import com.ktds.youtube.video.vo.GroupVideoVO;
import com.ktds.youtube.video.vo.VideoVO;

@Repository
public class VideoDaoImpl extends SqlSessionDaoSupport implements VideoDao {

	@Autowired
	@Override
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		super.setSqlSessionTemplate(sqlSessionTemplate);
	}

	@Override
	public int insertOneVideo(VideoVO videoVO) {
		return getSqlSession().insert("VideoDao.insertOneVideo", videoVO);
	}

	@Override
	public int updateOneVideo(VideoVO videoVO) {
		return getSqlSession().update("VideoDao.updateOneVideo", videoVO);
	}

	@Override
	public int deleteOneVideo(String videoId) {
		return getSqlSession().delete("VideoDao.deleteOneVideo", videoId);
	}

	@Override
	public VideoVO selectOneVideo(String videoId) {
		return getSqlSession().selectOne("VideoDao.selectOneVideo", videoId);
	}

	@Override
	public List<GroupVideoVO> selectAllVideo() {
		return getSqlSession().selectList("VideoDao.selectAllVideo");
	}

	@Override
	public int updateViewCount(String videoId) {
		return getSqlSession().update("VideoDao.updateViewCount", videoId);
	}
	
	
	
}
