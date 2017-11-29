package com.jedlab.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Task")
public class Task extends Po {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "prj_name")
	private Project project;
	private String nsme;

	public String getNsme() {
		return nsme;
	}

	public void setNsme(String nsme) {
		this.nsme = nsme;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}
	
	
}
