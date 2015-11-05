package com.iqs.model;

import java.io.Serializable;

import javax.persistence.*;

import java.util.List;


/**
 * The persistent class for the project database table.
 * 
 */
@Entity
@NamedQuery(name="Project.findAll", query="SELECT p FROM Project p")
public class Project implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PROJECT_ID")
	private int projectId;

	@Column(name="PROJECT_NAME")
	private String projectName;

	//bi-directional many-to-one association to Url
	@OneToMany(mappedBy="project")
	private List<Url> url;

	public Project() {
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

	public List<Url> getUrl() {
		return this.url;
	}

	public void setUrl(List<Url> urllists) {
		this.url = urllists;
	}

	public Url addUrl(Url url) {
		getUrl().add(url);
		url.setProject(this);

		return url;
	}

	public Url removeUrl(Url url) {
		getUrl().remove(url);
		url.setProject(null);

		return url;
	}

}