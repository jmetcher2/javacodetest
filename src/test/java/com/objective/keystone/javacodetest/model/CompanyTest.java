package com.objective.keystone.javacodetest.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class CompanyTest {

        @Test
        public void testNewCompanyHasEmptyDepartments() {
            fail();
        }
        
        @Test
        public void testCantAddSameDepartmentName() {
            Company c = new Company();
            assertTrue(c.addDepartment("testDepartment"));
            assertEquals(1, c.getDepartments().size());
            
            assertFalse(c.addDepartment("testDepartment"));
            assertEquals(1, c.getDepartments().size());
        }

        @Test
        public void testCanAddDifferentDepartmentName() {
            Company c = new Company();
            assertTrue(c.addDepartment("testDepartment"));
            assertEquals(1, c.getDepartments().size());
            
            assertTrue(c.addDepartment("testDepartment2"));
            assertEquals(2, c.getDepartments().size());
        }
        
        @Test
        public void testProjectCount() {
            // See DepartmentTest.testProjectCount for some setup code you can reuse
            fail();
        }
        
}
