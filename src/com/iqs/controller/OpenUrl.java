package com.iqs.controller;


import java.awt.Desktop;
import java.net.URL;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.iqs.model.Host;
import com.iqs.service.GetUrlService;
import com.iqs.service.UrlService;
import com.iqs.service.HostService;
import com.iqs.service.ProjectService;

@ManagedBean
@SessionScoped
@Component
public class OpenUrl {
	
	 @Autowired
	 private  ProjectService projectService;
	 @Autowired
	 private HostService hostService;
	 @Autowired
	 private UrlService urlService;
	 @Autowired
	 private GetUrlService getUrlService;
	 
	 
	
	 
	 public void testtest() {

			try {

				//Project project = new Project();
				
				//project.setProjectName("Test");
				//projectService.save(project); 
				String projectname = projectService.getProjectNameById(1).getProjectName();
				
				System.out.println(projectname);
				
				String uri =  getUrlService.getHostUriByProdIdEnvId(1, 2).get(0).toString();
				System.out.println(uri);
				
				String uriname = urlService.getUriNameByProjectId(1).getUriName();
				System.out.println(uriname);
				
				//System.out.println(getUrlService.getHostUriByProdIdEnvId(1, 2));

				System.out.println("done");

			} catch (Exception e) {
				System.out.println("R3");
				e.printStackTrace();
			}
		}
	public void shin() throws Exception {
		//String hostname =  hostService.getHostNameByHostId(1).getHostName();
		//String uriname = urlService.getUriNameByProjectId(1).getUriName();
		String uri =  getUrlService.getHostUriByProdIdEnvId(1, 2).get(0).toString();
		OpenUrl browse = new OpenUrl();
		//browse.CallUrl("http://teststore.iqsolutions.com/home");
		browse.CallUrl(uri);
	}

	public void nhlbi() throws Exception {
		String uri =  getUrlService.getHostUriByProdIdEnvId(2, 2).get(0).toString();
		OpenUrl browse = new OpenUrl();
		//browse.CallUrl("http://testnhlbi.iqsolutions.com/catalog/home");
		browse.CallUrl(uri);
	}

	public void ninds() throws Exception {
		String uri =  getUrlService.getHostUriByProdIdEnvId(3, 2).get(0).toString();
		OpenUrl browse = new OpenUrl();
		//browse.CallUrl("http://testninds.iqsolutions.com/ninds/home");
		browse.CallUrl(uri);
	}

	public void nimh() throws Exception {
		String uri =  getUrlService.getHostUriByProdIdEnvId(4, 2).get(0).toString();
		OpenUrl browse = new OpenUrl();
		//browse.CallUrl("http://testnimh.iqsolutions.com/");
		browse.CallUrl(uri);
	}
	
	public void pinnacle() throws Exception {
		String uri =  getUrlService.getHostUriByProdIdEnvId(5, 2).get(0).toString();
		OpenUrl browse = new OpenUrl();
		//browse.CallUrl("http://testnimh.iqsolutions.com/");
		browse.CallUrl(uri);
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
