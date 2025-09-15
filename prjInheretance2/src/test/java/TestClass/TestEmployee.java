/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package TestClass;

import com.mycompany.prjinheretance2.Employee;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author DrxpS
 */
public class TestEmployee {
    
   @Test
   public void testEmployeePay()
   {
       Employee emp = new Employee("Alice", 5000.0);
       
       double expected = 5000.0;
       double actual = emp.calculatePay();
       
       assertEquals(expected, actual , "Normal employee pay should be base salary");
   }
    
}
