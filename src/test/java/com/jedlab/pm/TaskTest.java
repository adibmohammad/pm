package com.jedlab.pm;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jedlab.model.Project;
import com.jedlab.model.Task;
import com.jedlab.service.ProjectService;
import com.jedlab.service.TaskService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/test-context.xml"})
public class TaskTest {

	@Autowired
	TaskService taskservice;
	
	@Autowired
	ProjectService projectservice;
	
	@Test
	public void taskInsert()
	{
	Project project =projectservice.findAll().iterator().next();
		
		for(int i = 0 ; i<10 ; i++) {
			Task t = new Task();
			t.setProject(project);
		t.setNsme("task" + i);
		taskservice.persist(t);
		}
	}
}
