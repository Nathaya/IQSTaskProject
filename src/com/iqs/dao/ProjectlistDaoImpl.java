package com.iqs.dao;


import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import util.HibernateUtil;

import com.iqs.model.Projectlist;

@Repository("projectlistDao")
public class ProjectlistDaoImpl implements ProjectlistDao {
 
	
	 @Autowired
	    private SessionFactory sessionFactory;
	 
	   Session session = null;
	 Transaction tx = null;  
	 

	@Override
	 public void save(Projectlist projectlist) throws Exception{

		/*sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession(); 
		session.beginTransaction();
		session.save(projectlist);*/
	       
		 this.sessionFactory.getCurrentSession().save(projectlist);
 
	 }
	 

	 @Override
	public Projectlist getProjectNameById(int projectId) throws Exception {
		// return (Projectlist) sessionFactory.getCurrentSession().get(Projectlist.class, projectId);
	session = sessionFactory.openSession();  
	Projectlist projectlist = (Projectlist) session.get(Projectlist.class, projectId); //.load(Hostlist.class,new Integer(hostId)); 
	  tx = session.getTransaction();  
	  session.beginTransaction();  
	  tx.commit();  
	  return projectlist; 
	}
	
	 @SuppressWarnings("unchecked")
	@Override
	    public List<Projectlist> getAllProject() {
	        return this.sessionFactory.getCurrentSession().createQuery("from projectlist").list();
	    }
	
}
