package com.agileintelligence.ppmtool.services;

import com.agileintelligence.ppmtool.domain.Project;
import com.agileintelligence.ppmtool.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdate(Project project){
        // Logic to update or check the owner of the project
        return projectRepository.save(project);
    }
}
