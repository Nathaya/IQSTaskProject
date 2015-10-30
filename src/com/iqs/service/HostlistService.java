package com.iqs.service;

import org.springframework.stereotype.Service;

import com.iqs.model.Hostlist;


public interface HostlistService {
	 public Hostlist getHostNameById(int hostId) throws Exception;

}
