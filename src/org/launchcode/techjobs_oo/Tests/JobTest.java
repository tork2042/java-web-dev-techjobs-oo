package org.launchcode.techjobs_oo.Tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    public Job testJob1;
    public Job testJob2;
    public Job testJob3;

    @Before
    public void createTestJob() {
        testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        testJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        testJob3 = new Job("", new Employer(""), new Location(""),
                new PositionType(""), new CoreCompetency(""));
    }

    @Test
    public void testSettingJobId(){
        assertEquals(testJob1.getId()+1, testJob2.getId());
    }


    @Test
    public void testJobConstructorSetsAllFields(){
        assertEquals("Product tester", testJob1.getName());
        assertEquals("ACME", testJob1.getEmployer().getValue());
        assertEquals("Desert", testJob1.getLocation().getValue());
        assertEquals("Quality control", testJob1.getPositionType().getValue());
        assertEquals("Persistence", testJob1.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality(){
        assertFalse(testJob1.getId()==testJob2.getId());
        assertTrue(testJob1.getName().equals(testJob2.getName()));
        assertTrue(testJob1.getEmployer().getValue()==testJob2.getEmployer().getValue());
        assertTrue(testJob1.getLocation().getValue()==testJob2.getLocation().getValue());
        assertTrue(testJob1.getPositionType().getValue()==testJob2.getPositionType().getValue());
        assertTrue(testJob1.getCoreCompetency().getValue()==testJob2.getCoreCompetency().getValue());

    }

    @Test
    public void testToStringMethod(){
//        Test for line break at beginning and end of job printout
//        assertEquals(testJob1.toString().charAt(0,0), "\'");
        assertTrue(testJob1.toString().contains("ID: " + testJob1.getId()));
        assertTrue(testJob1.toString().contains("Name: Product tester"));
        assertTrue(testJob1.toString().contains("Location: Desert"));
        assertTrue(testJob1.toString().contains("Employer: ACME"));
        assertTrue(testJob1.toString().contains("Position Type: Quality control"));
        assertTrue(testJob1.toString().contains("Core Competency: Persistence"));
        assertEquals(testJob3.getName(), "");
        assertTrue(testJob3.toString().contains("Name: Data not available"));
        assertEquals(testJob3.getLocation(), "");
        assertTrue(testJob3.toString().contains("Location: Data not available"));
//        assertEquals(testJob3.getName(), "");
//        assertTrue(testJob3.toString().contains("Name: Data not available"));
//        assertEquals(testJob3.getName(), "");
//        assertTrue(testJob3.toString().contains("Name: Data not available"));
//        assertEquals(testJob3.getName(), "");
//        assertTrue(testJob3.toString().contains("Name: Data not available"));



    }




}

