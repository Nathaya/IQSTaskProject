package com.iqs.dao;

import java.util.List;

import com.iqs.model.Project;

public interface ProjectDao {
	public Project getProjectNameById(int projectId) throws Exception;
	public void save(Project project) throws Exception;
	public List<Project> getAllProject();
	
}
