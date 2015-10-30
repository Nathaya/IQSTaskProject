package com.iqs.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.iqs.model.Hostlist;

@Repository("hostlistDao")
public class HostlistDaoImpl implements HostlistDao {
	 
	@Autowired  
	 SessionFactory sessionFactory;  
	  
	 Session session = null;  
	 Transaction tx = null;  
	
	 @Override
	 public Hostlist getHostNameById(int hostId) throws Exception {		
	
		session = sessionFactory.openSession();  
		  Hostlist hostlist = (Hostlist) session.get(Hostlist.class, hostId); //.load(Hostlist.class,new Integer(hostId)); 
		  tx = session.getTransaction();  
		  session.beginTransaction();  
		  tx.commit();  
		  return hostlist;  
	}
	  
	 
		 /*public Hostlist getHostNameById(int hostId) {
				return (Hostlist) this.sessionFactory.getCurrentSession().createQuery(
					"select host_name from Hostlist hostlist where host_id=?").setParameter(1,hostId)
					.uniqueResult();
			}*/

	}



