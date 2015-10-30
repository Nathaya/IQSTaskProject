package com.iqs.model;

import java.io.Serializable;

import javax.persistence.*;

import java.util.Date;


/**
 * The persistent class for the urllist database table.
 * 
 */
@Entity
@NamedQuery(name="Urllist.findAll", query="SELECT u FROM Urllist u")
public class Urllist implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="URI_ID")
	private int uriId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATE_DATE")
	private Date createDate;

	@Column(name="HOST_ID")
	private int hostId;

	@Column(name="PROJECT_ID")
	private int projectId;

	@Column(name="URI_NAME")
	private String uriName;

	//bi-directional many-to-one association to Projectlist
	@ManyToOne
	private Projectlist projectlist;

	//bi-directional many-to-one association to Hostlist
	@ManyToOne
	private Hostlist hostlist;

	public Urllist() {
	}

	public int getUriId() {
		return this.uriId;
	}

	public void setUriId(int uriId) {
		this.uriId = uriId;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public int getHostId() {
		return this.hostId;
	}

	public void setHostId(int hostId) {
		this.hostId = hostId;
	}

	public int getProjectId() {
		return this.projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getUriName() {
		return this.uriName;
	}

	public void setUriName(String uriName) {
		this.uriName = uriName;
	}

	public Projectlist getProjectlist() {
		return this.projectlist;
	}

	public void setProjectlist(Projectlist projectlist) {
		this.projectlist = projectlist;
	}

	public Hostlist getHostlist() {
		return this.hostlist;
	}

	public void setHostlist(Hostlist hostlist) {
		this.hostlist = hostlist;
	}

}