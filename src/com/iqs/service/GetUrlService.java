package com.iqs.service;

import java.util.List;

public interface GetUrlService {
	@SuppressWarnings("rawtypes")
	public List getHostUriByProdIdEnvId(int projectId, int envId) throws Exception;
	
}
