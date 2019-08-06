package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CohortTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void createNewCohortInstanceSuccessful_true(){
        Cohort testCohort = new Cohort("MC19", 51, "Samora");
        assertEquals(true, testCohort instanceof Cohort);
    }

    @Test
    public void Cohort_instantiatesWithCohortName_String(){
        Cohort testCohort = new Cohort("MC19", 51, "Samora");
        assertEquals("MC19", testCohort.getNameOfCohort());
    }

    @Test
    public void Cohort_instantiatesWithNoOfStudents_int(){
        Cohort testCohort = new Cohort("MC19", 51, "Samora");
        assertEquals(51, testCohort.getNoOfStudents());
    }

    @Test
    public void Cohort_instantiatesWithTechnicalMentor_String(){
        Cohort testCohort = new Cohort("MC19", 51, "Samora");
        assertEquals("samora", testCohort.getTechnicalMentor());
    }
}