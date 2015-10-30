package com.iqs.dao;

import java.util.List;

import com.iqs.model.Projectlist;

public interface ProjectlistDao {
	public Projectlist getProjectNameById(int projectId) throws Exception;
	public void save(Projectlist projectlist) throws Exception;
	public List<Projectlist> getAllProject();
	
}
