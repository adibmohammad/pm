package com.jedlab.pm;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jedlab.model.Project;
import com.jedlab.service.ProjectService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/test-context.xml"})
public class ProjectTest {

	@Autowired
	ProjectService projectservice;
	
	@Test
	public void projectInsert()
	{
		Project p = new Project();
		p.setName("my project");
		projectservice.persist(p);
	}
}
