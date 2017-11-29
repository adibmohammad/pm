package com.jedlab.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "project")
public class Project extends Po{

	@Column(name = "prj_name")
	String name;
	@OneToMany(mappedBy = "project")
	private List<Task> task = new ArrayList<Task>(0);
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
