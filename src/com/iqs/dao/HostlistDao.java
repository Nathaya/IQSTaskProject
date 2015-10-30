package com.iqs.dao;

import org.springframework.stereotype.Service;

import com.iqs.model.Hostlist;

@Service
public interface HostlistDao {
	public Hostlist getHostNameById(int hostId) throws Exception;
}
