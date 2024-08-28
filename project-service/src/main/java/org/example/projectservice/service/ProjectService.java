package org.example.projectservice.service;

import org.example.projectservice.model.Project;
import org.example.projectservice.repository.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepo projectRepo;

    public Project save(Project project) {
        return projectRepo.save(project);
    }

    public List<Project> getAllProjects() {
        return projectRepo.findAll();
    }

    public Project getProjectById(int id) {
        return projectRepo.findById(id).orElseThrow();
    }

    public void deleteProjectById(int id) {
        projectRepo.deleteById(id);
    }

    public Project updateProjectById(int id, Project project) {
        return projectRepo.save(project);
    }

}
