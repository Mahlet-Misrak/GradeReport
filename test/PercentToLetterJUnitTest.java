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

/**
 *
 * @author Anenmisrak
 */
public class PercentToLetterJUnitTest {
    
    public PercentToLetterJUnitTest() {
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

       @Test
   public void testTypical() {
      assertEquals("wrong grade", 'A', GradeReport.getLetterGrade(95));
      assertEquals("wrong grade", 'B', GradeReport.getLetterGrade(72));
      assertEquals("wrong grade", 'C', GradeReport.getLetterGrade(55));
      assertEquals("wrong grade", 'F', GradeReport.getLetterGrade(30));
   }
 
   // Test the boundaries of the each partition
   @Test
   public void testBoundaries() {
      assertEquals("wrong grade", 'B', GradeReport.getLetterGrade(75));
      assertEquals("wrong grade", 'A', GradeReport.getLetterGrade(100));
      assertEquals("wrong grade", 'B', GradeReport.getLetterGrade(60));// fail
      assertEquals("wrong grade", 'B', GradeReport.getLetterGrade(74));
      assertEquals("wrong grade", 'F', GradeReport.getLetterGrade(50)); // fail
      assertEquals("wrong grade", 'C', GradeReport.getLetterGrade(59));
      assertEquals("wrong grade", 'F', GradeReport.getLetterGrade(0));
      assertEquals("wrong grade", 'F', GradeReport.getLetterGrade(30));
   }
}
