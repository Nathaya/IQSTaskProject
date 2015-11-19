package com.iqs.dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iqs.model.Project;

@Repository("projectDao")
public class ProjectDaoImpl implements ProjectDao {
 
	
	 @Autowired
	    private SessionFactory sessionFactory;
	 
	   Session session = null;
	 Transaction tx = null;  
	 

	@Override
	 public void save(Project project) throws Exception{

		/*sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession(); 
		session.beginTransaction();
		session.save(project);*/
	       
		 this.sessionFactory.getCurrentSession().save(project);
 
	 }
	 
	 @Override
	public Project getProjectNameById(int projectId) throws Exception {
		// return (Project) sessionFactory.getCurrentSession().get(Project.class, projectId);
	session = sessionFactory.openSession();  
	Project project = (Project) session.get(Project.class, projectId); //.load(Hostlist.class,new Integer(hostId)); 
	  tx = session.getTransaction();  
	  session.beginTransaction();  
	  tx.commit();  
	  return project; 
	}
	
	 @SuppressWarnings("unchecked")
	@Override
	    public List<Project> getAllProject() {
	        return this.sessionFactory.getCurrentSession().createQuery("from project").list();
	    }
	
}
