package com.iqs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.iqs.dao.GetUrlDao;

@Service
public class GetUrlServiceImpl implements GetUrlService {
	
	@Autowired  
	@Qualifier("getUrlDao")
	private GetUrlDao getUrlDao; 
	
	
	@SuppressWarnings("rawtypes")
	@Override
	public List getHostUriByProdIdEnvId(int projectId, int envId) throws Exception
	{
		return getUrlDao.getHostUriByProdIdEnvId(projectId, envId);
		
	}


}
