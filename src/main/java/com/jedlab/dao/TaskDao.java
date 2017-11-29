package com.jedlab.dao;

import org.springframework.data.repository.CrudRepository;

import com.jedlab.model.Task;

public interface TaskDao extends CrudRepository<Task, Long> {

}
