package com.objective.keystone.javacodetest.model;

import java.util.ArrayList;
import java.util.List;

public class Department {
    
    private String name;
    private List<Project> projects = new ArrayList<Project>();
    
    public Department() {
    }

    public Department(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String string) {
        this.name = string;
    }

    public List<Project> getProjects() {
        return projects;
    }
    
    public long getProjectCount() {
        return projects.stream().filter(p -> !p.isArchived()).count();
    }
}
