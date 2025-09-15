/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package TestClass;

import com.mycompany.prjinheretance3.EmpA;
import com.mycompany.prjinheretance3.EmpB;
import com.mycompany.prjinheretance3.Person;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author DrxpS
 */
public class TestEmployee {
    
   @Test
   public void testPersonName()
   {
      Person p = new Person(1,"Alice");
        
       String expected = "Alice";
       String actual = p.getName();
       
       assertEquals(expected, actual , "Name should be Alice");
   }
    
    @Test
   public void testEmpAPay()
   {
       EmpA emp = new EmpA(1,"Alice", 5000.0);
       
       double expected = 5000.0;
       double actual = emp.getDblSalary();
       
       assertEquals(expected, actual , "Normal employee pay should be base salary");
   }
    @Test
   public void testEmpBName()
   {
       EmpB emp = new EmpB(1,"Alice", 5000.0);
       
       String expected = "Alice";
       String actual = emp.getName();
       
       assertEquals(expected, actual , "Name should be Alice");
   }
   
    @Test
   public void testPersonID()
   {
      Person p = new Person(1,"Alice");
         
       int expected = 1;
       int actual = p.getID();
       
       assertEquals(expected, actual , "ID should be 1");
   }
    
}
