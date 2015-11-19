package com.iqs.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.iqs.dao.UrlDao;
import com.iqs.model.Url;

public class UrlServiceImpl implements UrlService {
	
	@Autowired
	private UrlDao urlDao; 
	
	@Override
	public Url getUriNameByProjectId(int projectId) throws Exception {
		return urlDao.getUriNameByProjectId(projectId);
	}

}
