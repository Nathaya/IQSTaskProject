package com.iqs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iqs.model.Project;

@Service
public interface ProjectService {
	 public Project getProjectNameById(int project) throws Exception;
	 public void save(Project project) throws Exception;
	 public List<Project> getAllProject();
	 public void test();
}
