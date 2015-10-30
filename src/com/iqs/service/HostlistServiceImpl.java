package com.iqs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.iqs.dao.HostlistDao;
import com.iqs.model.Hostlist;

@Service
public class HostlistServiceImpl implements HostlistService {
	
	@Autowired  
	@Qualifier("hostlistDao")
	private HostlistDao hostlistDao; 
	
	@Override
	public Hostlist getHostNameById(int hostId) throws Exception {
		return hostlistDao.getHostNameById(hostId);  
    }  

}
