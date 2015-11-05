import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import com.iqs.model.Project;
import com.iqs.service.ProjectService;

import util.HibernateUtil;


public class test 

	{
	 @Autowired
	 private static  ProjectService projectlistService;
	 
		public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException
		{
			try
			{
				System.out.println(projectlistService);
				Project projectlist = new Project();
				projectlist.setProjectId(1);
				projectlist.setProjectName("test");
				projectlistService.save(projectlist);
			String url = "jdbc:mysql://localhost:3306/test_iqs";
			String user = "root";
			String password = "root";

			// Load the Connector/J driver
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			// Establish connection to MySQL
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println(conn);
			
			System.out.println("successful");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			test mgr = new test();

		
		            mgr.createAndStoreEvent(2, "FFFF");
		  

		        HibernateUtil.getSessionFactory().close();
		}

			    private void createAndStoreEvent(int projectId, String projectName) {
			        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			        session.beginTransaction();

			        Project project = new Project();
			        project.setProjectId(projectId);
			        project.setProjectName(projectName);
			        session.save(project);

			        session.getTransaction().commit();
			    }

		
		
	}	