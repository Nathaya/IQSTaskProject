package com.iqs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iqs.model.Projectlist;

@Service
public interface ProjectlistService {
	 public Projectlist getProjectNameById(int projectlist) throws Exception;
	 public void save(Projectlist projectlist) throws Exception;
	 public List<Projectlist> getAllProject();
	 public void test();
}
