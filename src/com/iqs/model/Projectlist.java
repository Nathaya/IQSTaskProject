package com.iqs.model;

import java.io.Serializable;

import javax.persistence.*;

import java.util.List;


/**
 * The persistent class for the projectlist database table.
 * 
 */
@Entity
@NamedQuery(name="Projectlist.findAll", query="SELECT p FROM Projectlist p")
public class Projectlist implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PROJECT_ID")
	private int projectId;

	@Column(name="PROJECT_NAME")
	private String projectName;

	//bi-directional many-to-one association to Urllist
	@OneToMany(mappedBy="projectlist")
	private List<Urllist> urllists;

	public Projectlist() {
	}

	public int getProjectId() {
		return this.projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public List<Urllist> getUrllists() {
		return this.urllists;
	}

	public void setUrllists(List<Urllist> urllists) {
		this.urllists = urllists;
	}

	public Urllist addUrllist(Urllist urllist) {
		getUrllists().add(urllist);
		urllist.setProjectlist(this);

		return urllist;
	}

	public Urllist removeUrllist(Urllist urllist) {
		getUrllists().remove(urllist);
		urllist.setProjectlist(null);

		return urllist;
	}

}