package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void createNewStudentsInstanceSuccessful_true(){
        Students testStudent = new Students("Samora Yommie", "Android", "Hospital Hill Highschool", 27, "My bio should just say caffeinated", "4KYU", 67);
        assertEquals(true, testStudent instanceof Students);
    }

}