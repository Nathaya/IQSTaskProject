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
		
		public void choiceUrl(){
			if (projtype == 6){
				int count = projtype;
				for (int i = 1; i < count; i++) {
					projtype = i;
					browseurl();
				}
				projtype = count;
			}else{
				browseurl();
			}
    	}

	public void browseurl() {
		 
	 String uri;
		try {
			uri = getUrlService.getHostUriByProdIdEnvId(projtype,envtype).get(0).toString();
			setError(" ");
			openUrlChoice browse = new openUrlChoice();
				browse.callUrl(uri);
	
		} catch (Exception NullPointerException) {
			// TODO Auto-generated catch block
			setError("**Have no data in Table!!");
		}
		
	 }
	
	public void callUrl(String url) {
		try {
		//System.out.println("Test1");
			Desktop.getDesktop().browse(new URL(url).toURI());
		    
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
