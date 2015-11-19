package com.iqs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iqs.dao.ProjectDao;
import com.iqs.model.Project;

@Service("projectService")
public class ProjectServiceImpl implements ProjectService {
	
	@Autowired
	private ProjectDao projectDao; 
	

	 
	@Override
	@Transactional
	 public Project getProjectNameById(int projectId) throws Exception{
		  return projectDao.getProjectNameById(projectId);  
    }  
	
	@Override
	@Transactional
    public void save(Project project) throws Exception{
		projectDao.save(project);
    }
	
	@Override
    @Transactional
    public List<Project> getAllProject() {
        return projectDao.getAllProject();
    }
	
	@Override
	public void test(){
		System.out.println("Test");
	}
	
}
