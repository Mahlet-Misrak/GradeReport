/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Anenmisrak
 */
public class AvgJUnitTest {
    
    public AvgJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    //     @Test
   public void TypicalavgTest() {
        assertEquals(100, 100, GradeReport.average(500));
        assertEquals(60, 60, GradeReport.average(300));
        assertEquals(5, 5, GradeReport.average(100));
        
     
   }
 @Ignore //Ignored intentionaly
   @Test(timeout=1000) // set test timeout
      public void FalingavgTest() {
        assertEquals(80, 90, GradeReport.average(400));
        assertEquals(50, 100, GradeReport.average(250));
        assertEquals(5, 90, GradeReport.average(100));
     
   }
}
