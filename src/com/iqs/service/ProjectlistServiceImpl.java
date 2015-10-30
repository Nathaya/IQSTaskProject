package com.iqs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iqs.dao.ProjectlistDao;
import com.iqs.model.Projectlist;

@Service("projectlistService")
public class ProjectlistServiceImpl implements ProjectlistService {
	
	@Autowired
	private ProjectlistDao projectlistDao; 
	

	 
	@Override
	@Transactional
	 public Projectlist getProjectNameById(int projectId) throws Exception{
		  return projectlistDao.getProjectNameById(projectId);  
    }  
	
	@Override
	@Transactional
    public void save(Projectlist projectlist) throws Exception{
		projectlistDao.save(projectlist);
    }
	
	@Override
    @Transactional
    public List<Projectlist> getAllProject() {
        return projectlistDao.getAllProject();
    }
	
	@Override
	public void test(){
		System.out.println("Test");
	}
	
}
