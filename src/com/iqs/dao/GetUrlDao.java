package com.iqs.dao;

import java.util.List;

public interface GetUrlDao {
	 @SuppressWarnings("rawtypes")
	public List getHostUriByProdIdEnvId(int projectId, int envId) throws Exception;
	
}
