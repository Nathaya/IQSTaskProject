package com.iqs.model;

import java.io.Serializable;

import javax.persistence.*;

import java.util.List;


/**
 * The persistent class for the host database table.
 * 
 */
@Entity
@NamedQuery(name="Host.findAll", query="SELECT h FROM Host h")
public class Host implements Serializable {
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

	//bi-directional many-to-one association to Env
	@ManyToOne
	private Env env;

	//bi-directional many-to-one association to Url
	@OneToMany(mappedBy="host")
	private List<Url> url;

	public Host() {
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

	public Env getEnv() {
		return this.env;
	}

	public void setEnv(Env env) {
		this.env = env;
	}

	public List<Url> getUrl() {
		return this.url;
	}

	public void setUrl(List<Url> url) {
		this.url = url;
	}

	public Url addUrl(Url url) {
		getUrl().add(url);
		url.setHost(this);

		return url;
	}

	public Url removeUrl(Url url) {
		getUrl().remove(url);
		url.setHost(null);

		return url;
	}

}