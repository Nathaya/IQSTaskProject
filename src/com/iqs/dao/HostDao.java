package com.iqs.dao;

import com.iqs.model.Host;

public interface HostDao {
	public Host getHostNameByHostId(int hostId) throws Exception;

	
}
