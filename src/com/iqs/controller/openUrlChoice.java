package com.iqs.controller;

import java.awt.Desktop;
import java.net.URL;

import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;

import com.iqs.service.GetUrlService;

@ManagedBean
@SessionScoped
public class openUrlChoice {
	
	 @Autowired
	 private GetUrlService getUrlService;
	 
	 private int projtype = 1;
	 private int envtype = 2;
	 private String error;
		
	 public int getProjtype() {
			return projtype;
		}

		public void setProjtype(int projtype) {
			this.projtype = projtype;
		}
		 
		
	 public int getEnvtype() {
			return envtype;
		}

		public void setEnvtype(int envtype) {
			this.envtype = envtype;
		}
		

		public String getError() {
			return error;
		}

		public void setError(String error) {
			this.error = error;
		}

	public void browseurl() {
		 
		 String uri;
		try {
			uri = getUrlService.getHostUriByProdIdEnvId(projtype,envtype).get(0).toString();
			setError(" ");
				OpenUrl browse = new OpenUrl();
				browse.CallUrl(uri);
	
		} catch (Exception NullPointerException) {
			// TODO Auto-generated catch block
			setError("**Have No data in Table!!");
		}
		
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
