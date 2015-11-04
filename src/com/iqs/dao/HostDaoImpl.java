package com.iqs.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iqs.model.Host;

@Repository("hostDao")
public class HostDaoImpl implements HostDao {
	 
	@Autowired  
	 SessionFactory sessionFactory;  
	  
	 Session session = null;  
	 Transaction tx = null;  
	
	 @Override
	 public Host getHostNameByHostId(int hostId) throws Exception {		
	
		session = sessionFactory.openSession();  
		  Host host = (Host) session.get(Host.class, hostId); //.load(Hostlist.class,new Integer(hostId)); 
		  tx = session.getTransaction();  
		  session.beginTransaction();  
		  tx.commit();  
		  return host;  
	}
	  
	

}



