package com.jedlab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jedlab.dao.TaskDao;
import com.jedlab.model.Task;

@Service
public class TaskService {

	
	@Autowired
	TaskDao taskdao;
	@Autowired
	ProjectService projectservice;
	
	@Transactional
	public void persist(Task instance)
	{
		taskdao.save(instance);
	}
}
