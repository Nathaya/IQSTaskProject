package com.iqs.dao;

import java.sql.ResultSet;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iqs.model.Host;
import com.iqs.model.Url;

@Repository("getUrlDao")
public class GetUrlDaoImpl implements GetUrlDao {
	
	@Autowired  
	 SessionFactory sessionFactory;  
	
	 Session session = null;  
	 Transaction tx = null;  

	@SuppressWarnings("rawtypes")
	@Override
	public List getHostUriByProdIdEnvId(int projectId, int envId) throws Exception 
	{
		session = sessionFactory.openSession(); 	
		tx = session.beginTransaction();  
		
		String sql = "select concat(h.host_name,u.uri_name) as urlbrowse "+
				"from  url u, host h "+
				"where u.host_id=h.host_id "+
				"and u.project_id = :projectId "+
				"and h.env_id=:envId"; 
	     SQLQuery query = session.createSQLQuery(sql);
	     query.setParameter("projectId", projectId);
	     query.setParameter("envId", envId);
	     // query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
	     return query.list();

	}

}
