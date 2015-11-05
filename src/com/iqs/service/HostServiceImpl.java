package com.iqs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.iqs.dao.HostDao;
import com.iqs.model.Host;

@Service
public class HostServiceImpl implements HostService {
	
	@Autowired  
	@Qualifier("hostDao")
	private HostDao hostDao; 
	
	@Override
	public Host getHostNameByHostId(int hostId) throws Exception {
		return hostDao.getHostNameByHostId(hostId);  
		
    }  
	
}
