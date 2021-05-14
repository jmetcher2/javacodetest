package com.objective.keystone.javacodetest.model;

public class Project {

    private String name;
    private boolean archived = false;

    public Project(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public boolean isArchived() {
        return archived;
    }
    
    public void archive() {
        this.archived = true;
    }
}
