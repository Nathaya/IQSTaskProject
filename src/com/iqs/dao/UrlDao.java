package com.iqs.dao;

import com.iqs.model.Url;

public interface UrlDao {
	public Url getUriNameByProjectId(int projectId) throws Exception;
}
