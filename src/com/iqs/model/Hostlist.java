package com.iqs.model;

import java.io.Serializable;

import javax.persistence.*;

import java.util.List;


/**
 * The persistent class for the hostlist database table.
 * 
 */
@Entity
@NamedQuery(name="Hostlist.findAll", query="SELECT h FROM Hostlist h")
public class Hostlist implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="HOST_ID")
	private int hostId;

	@Column(name="ENV_ID")
	private int envId;

	@Column(name="HOST_NAME")
	private String hostName;

	private String port;

	//bi-directional many-to-one association to Envlist
	@ManyToOne
	private Envlist envlist;

	//bi-directional many-to-one association to Urllist
	@OneToMany(mappedBy="hostlist")
	private List<Urllist> urllists;

	public Hostlist() {
	}

	public int getHostId() {
		return this.hostId;
	}

	public void setHostId(int hostId) {
		this.hostId = hostId;
	}

	public int getEnvId() {
		return this.envId;
	}

	public void setEnvId(int envId) {
		this.envId = envId;
	}

	public String getHostName() {
		return this.hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public String getPort() {
		return this.port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public Envlist getEnvlist() {
		return this.envlist;
	}

	public void setEnvlist(Envlist envlist) {
		this.envlist = envlist;
	}

	public List<Urllist> getUrllists() {
		return this.urllists;
	}

	public void setUrllists(List<Urllist> urllists) {
		this.urllists = urllists;
	}

	public Urllist addUrllist(Urllist urllist) {
		getUrllists().add(urllist);
		urllist.setHostlist(this);

		return urllist;
	}

	public Urllist removeUrllist(Urllist urllist) {
		getUrllists().remove(urllist);
		urllist.setHostlist(null);

		return urllist;
	}

}