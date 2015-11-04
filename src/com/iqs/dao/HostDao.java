package com.iqs.dao;

import java.util.List;

import com.iqs.model.Host;

public interface HostDao {
	public Host getHostNameByHostId(int hostId) throws Exception;

	
}
