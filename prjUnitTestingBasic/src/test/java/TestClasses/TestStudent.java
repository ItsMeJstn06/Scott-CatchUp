/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package TestClasses;

import com.mycompany.prjunittestingbasic.Student;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author DrxpS
 */
public class TestStudent {
    
    @Test
    public void testMarkFail(){
       Student s = new Student(); 
       
       int Expected = 75;
       
       int Actual = s.getStudentMark();
       
       assertNotEquals(Expected , Actual , "Expect it to fail so must be pass");
 
    }
    
    @Test
    public void testName(){
       Student s = new Student(); 
       
        String Expected = "Justin";
       
       String Actual = s.getStudentName();
       
       assertEquals(Expected , Actual , "Expect Justin");
 
    }
    
    
    
}
