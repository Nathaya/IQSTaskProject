package com.iqs.controller;


import java.awt.Desktop;
import java.net.URL;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.iqs.model.Projectlist;
import com.iqs.service.ProjectlistService;

@ManagedBean
@SessionScoped
@Component
public class OpenUrl {
	
	 @Autowired
	 private  ProjectlistService projectlistService;
	 
	 public void testtest() {

			try {

				Projectlist projectlist = new Projectlist();
				//projectlist.setProjectId(1);
				projectlist.setProjectName("Test");
				
				projectlistService.save(projectlist); 
				//projectlistService.getAllProject();
		
			//	projectlistService.getProjectNameById(1);
				System.out.println(projectlistService.getProjectNameById(1).getProjectName());
				

				System.out.println("done");

			} catch (Exception e) {
				System.out.println("R3");
				e.printStackTrace();
			}
		}
	public void shin() {
		OpenUrl browse = new OpenUrl();
		browse.CallUrl("http://teststore.iqsolutions.com/home");
	}

	public void nhlbi() {
		OpenUrl browse = new OpenUrl();
		browse.CallUrl("http://testnhlbi.iqsolutions.com/catalog/home");
	}

	public void ninds() {
		OpenUrl browse = new OpenUrl();
		browse.CallUrl("http://testninds.iqsolutions.com/ninds/home");
	}

	public void nimh() {
		OpenUrl browse = new OpenUrl();
		browse.CallUrl("http://testnimh.iqsolutions.com/");
	}

	public void CallUrl(String url) {
		try {
		//System.out.println("Test1");
			Desktop.getDesktop().browse(new URL(url).toURI());
		    
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
