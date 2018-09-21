package com.ktds.youtube.common.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.ktds.youtube.uploader.dao.UploaderDao;
import com.ktds.youtube.uploader.vo.UploaderVO;

public class SessionInterceptor extends HandlerInterceptorAdapter {
	
	@Autowired
	private UploaderDao uploaderDao;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession();
		String contextPath = request.getContextPath();
		if ( session.getAttribute("_USER_") == null ) {
			response.sendRedirect(contextPath + "/uploader/login");
			return false;
		}
		return true;
		
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		HttpSession session = request.getSession();
		UploaderVO sessionUploaderVO = (UploaderVO) session.getAttribute("_USER_");
		
		if ( sessionUploaderVO != null ) {			
			UploaderVO uploaderVO = uploaderDao.selectOneUploader(sessionUploaderVO);
			session.setAttribute("_USER_", uploaderVO);
		}
	}
	
}
