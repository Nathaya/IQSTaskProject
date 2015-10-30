package com.iqs.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the envlist database table.
 * 
 */
@Entity
@NamedQuery(name="Envlist.findAll", query="SELECT e FROM Envlist e")
public class Envlist implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ENV_ID")
	private int envId;

	@Column(name="ENV_NAME")
	private String envName;

	//bi-directional many-to-one association to Hostlist
	@OneToMany(mappedBy="envlist")
	private List<Hostlist> hostlists;

	public Envlist() {
	}

	public int getEnvId() {
		return this.envId;
	}

	public void setEnvId(int envId) {
		this.envId = envId;
	}

	public String getEnvName() {
		return this.envName;
	}

	public void setEnvName(String envName) {
		this.envName = envName;
	}

	public List<Hostlist> getHostlists() {
		return this.hostlists;
	}

	public void setHostlists(List<Hostlist> hostlists) {
		this.hostlists = hostlists;
	}

	public Hostlist addHostlist(Hostlist hostlist) {
		getHostlists().add(hostlist);
		hostlist.setEnvlist(this);

		return hostlist;
	}

	public Hostlist removeHostlist(Hostlist hostlist) {
		getHostlists().remove(hostlist);
		hostlist.setEnvlist(null);

		return hostlist;
	}

}