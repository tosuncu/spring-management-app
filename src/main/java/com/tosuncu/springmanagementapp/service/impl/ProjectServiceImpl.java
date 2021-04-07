package com.tosuncu.springmanagementapp.service.impl;

import com.tosuncu.springmanagementapp.entity.Project;
import com.tosuncu.springmanagementapp.repo.ProjectRepository;
import com.tosuncu.springmanagementapp.service.ProjectService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;

    public ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public Project save(Project project) {
        if(project.getProjectCode() == null ) {
            throw new IllegalArgumentException("ProjectCode cannot be null!");
        }
        return projectRepository.save(project);
    }

    @Override
    public Project getById(Long id) {

        return projectRepository.getOne(id);
    }

    @Override
    public List<Project> getProjectCode(String projectCode) {
        return null;
    }

    @Override
    public List<Project> getProjectCodeContains(String projectCode) {
        return null;
    }

    @Override
    public Page<Project> getAllPageable(Pageable pageable) {
        return projectRepository.findAll(pageable);
    }

    @Override
    public Boolean delete(Project project) {
        return null;
    }
}
