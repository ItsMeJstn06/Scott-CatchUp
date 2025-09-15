/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package TestClasses;

import com.mycompany.prjstudentgrades.Student;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author DrxpS
 */
public class TestStudentGrades {
    
    @Test
    public void TestCalculateAvarage(){
        Student s = new Student("John" , 90 , 80 ,70);
        double Expected = 80;
        double Actual = s.calculateAvarage();
        
        assertEquals(Expected,Actual,0.001,"Avarage must be 80.0");
        
    }
    
    @Test
    public void testStudentSummary(){
       Student s = new Student("Alice" , 90 , 90 ,90); 
       String Expected = "Student : Alice\nAvarage Score : 90.0";
       String Actual = s.studentSummary();
       
       assertEquals(Expected,Actual,"Summary should matche expected values");
    }
    
    @Test
    public void testPassed(){
        Student s = new Student("Maria" , 60 , 70 ,80); 
        
        assertEquals(s.hasPassed(),"Has to be greater than or equal to 50 to pass");
    }
    
}
