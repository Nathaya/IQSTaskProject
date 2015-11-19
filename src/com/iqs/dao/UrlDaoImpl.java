package com.iqs.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.iqs.model.Url;


public class UrlDaoImpl implements UrlDao {

	 @Autowired
	    private SessionFactory sessionFactory;
	 
	   Session session = null;
	 Transaction tx = null;  
	
	@Override
	public Url getUriNameByProjectId(int projectId) throws Exception {
		session = sessionFactory.openSession();  
		Url url = (Url) session.get(Url.class, projectId); //.load(Hostlist.class,new Integer(hostId)); 
		  tx = session.getTransaction();  
		  session.beginTransaction();  
		  tx.commit();  
		  return url; 
	}

}
