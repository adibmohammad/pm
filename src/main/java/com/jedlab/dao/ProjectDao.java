package com.jedlab.dao;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.jedlab.model.Project;

public interface ProjectDao extends PagingAndSortingRepository<Project, Long> {

}
