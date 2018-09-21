package com.ktds.youtube.common.web;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class CommonBean {

	@Bean("uploadPath") //이렇게도 빈 Container 생성 가능
	public String uploadPath() {
		return "D:/uploadVideos";
	}
	
}
