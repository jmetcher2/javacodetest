package com.objective.keystone.javacodetest.model;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class DepartmentTest {

    @Test
    public void testCanChangeDepartmentNames() {
        Company c = new Company();
        
        c.addDepartment("test1");
        c.addDepartment("test2");
        
        assertFalse(c.containsDepartment("new name"));
        
        List<Department> departments = c.getDepartments();
        for (Department d: departments) {
            d.setName("new name");
        }
        
        assertTrue(c.containsDepartment("new name"));
        
    }
    
    @Test
    public void testProjectCount() {
        Company c = new Company("test");
        Department d1 = new Department("test1");
        Department d2 = new Department("test2");
        
        c.getDepartments().add(d1);
        c.getDepartments().add(d2);
        
        Project d1p1 = new Project("Department 1 project 1");
        Project d1p2 = new Project("Department 1 project 2");
        d1.getProjects().add(d1p1);
        d1.getProjects().add(d1p2);
        
        
        Project d2p1 = new Project("Department 2 project 1");
        Project d2p2 = new Project("Department 2 project 2");
        d2.getProjects().add(d2p1);
        d2.getProjects().add(d2p2);
        
        d1p2.archive();
        
        // We don't count archived projects
        assertEquals(1, d1.getProjectCount());
        assertEquals(2, d2.getProjectCount());
    }
    
}
