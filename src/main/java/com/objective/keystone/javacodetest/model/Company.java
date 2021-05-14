package com.objective.keystone.javacodetest.model;

import java.util.ArrayList;
import java.util.List;

public class Company {
    
    private List<Department> departments;
    private String name;
    
    public Company() {}
    
    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<Department>();
    }
    
    public String getName() {
        return name;
    }
    
    public List<Department> getDepartments() {
        return departments;
    }
    
    public boolean addDepartment(String name) {
        return true;
    }
    
    public boolean containsDepartment(String string) {
        return true;
    }
    
    public long getProjectCount() {
        long count = 0;
        for (Department d: departments) {
            for (Project p: d.getProjects()) {
                count++;
            }
        }
        return count;
    }

}
