package com.tosuncu.springmanagementapp.service;

import com.tosuncu.springmanagementapp.entity.Project;
import com.tosuncu.springmanagementapp.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ProjectService {

    Project save(Project project);
    Project getById(Long id);
    List<Project> getProjectCode(String projectCode);
    List<Project> getProjectCodeContains(String projectCode);
    Page<Project> getAllPageable(Pageable pageable);
    Boolean delete(Project project);
}
