package com.jedlab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jedlab.dao.ProjectDao;
import com.jedlab.model.Project;

@Service
public class ProjectService {

	@Autowired
	ProjectDao projectdao;
	@Transactional
	public void persist(Project instance)
	{
		projectdao.save(instance);
	}
	
	public Iterable<Project> findAll()
	{
		Iterable<Project> result = projectdao.findAll();
		return result;
	}
}
