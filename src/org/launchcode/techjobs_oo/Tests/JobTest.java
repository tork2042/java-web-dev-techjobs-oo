package org.launchcode.techjobs_oo.Tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    private Job testJob1, testJob2, testJob3;

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
        assertFalse(testJob1.equals(testJob2));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        assertEquals(testJob3.toString().substring(0,1), "\n");
        assertEquals(testJob3.toString().substring(testJob3.toString().length()-1), "\n");

        // char firstChar = testJobFour.toString().charAt(0);
        // char lastChar = testJobFour.toString().charAt(testJobFour.toString().length() - 1);

        // assertEquals(Character.toString(firstChar), "\n");
        // assertEquals(Character.toString(lastChar), "\n");
    }

    @Test
    public void testToStringContainsCorrectLabelAndData(){
        String output = "\n" +
                "ID: " + testJob1.getId() + "\n" +
                "Name: " + testJob1.getName() + "\n" +
                "Employer: " + testJob1.getEmployer() + "\n" +
                "Location: " + testJob1.getLocation() + "\n" +
                "Position Type: " + testJob1.getPositionType() + "\n" +
                "Core Competency: " + testJob1.getCoreCompetency() + "\n";

        assertEquals(output, testJob1.toString());
    }

    @Test
    public void testToStringIfFieldEmptyReturnDataNotAvailable(){
        String output = "\n" +
                "ID: " + testJob3.getId() + "\n" +
                "Name: Data not available" + "\n" +
                "Employer: Data not available" + "\n" +
                "Location: Data not available" + "\n" +
                "Position Type: Data not available" + "\n" +
                "Core Competency: Data not available" + "\n";

        assertEquals(output, testJob3.toString());
    }




}

