package com.iqs.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the env database table.
 * 
 */
@Entity
@NamedQuery(name="Env.findAll", query="SELECT e FROM Env e")
public class Env implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ENV_ID")
	private int envId;

	@Column(name="ENV_NAME")
	private String envName;

	//bi-directional many-to-one association to Host
	@OneToMany(mappedBy="env")
	private List<Host> host;

	public Env() {
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

	public List<Host> getHost() {
		return this.host;
	}

	public void setHost(List<Host> host) {
		this.host = host;
	}

	public Host addHost(Host host) {
		getHost().add(host);
		host.setEnv(this);

		return host;
	}

	public Host removeHost(Host host) {
		getHost().remove(host);
		host.setEnv(null);

		return host;
	}

}