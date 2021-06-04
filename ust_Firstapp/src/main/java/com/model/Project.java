package com.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("project")
@Component
public class Project {
	
	private String version;
	private String name;
	private String location;
	private String teamlead;
	private String teamsize;
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getTeamlead() {
		return teamlead;
	}
	public void setTeamlead(String teamlead) {
		this.teamlead = teamlead;
	}
	public String getTeamsize() {
		return teamsize;
	}
	public void setTeamsize(String teamsize) {
		this.teamsize = teamsize;
	}
	
	
}
