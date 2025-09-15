/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjstringvalidation;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author DrxpS
 */
public class PrjStringValidation {

    public static void main(String[] args) {
        String sCheck = "HELLOworld";
        
        if (sCheck.matches(".*[a-z].*")){
            System.out.println("The String contains lowercase letters.");
        }
        else
        {
           System.out.println("No lowercase letters."); 
        }
        
        String sCheck1 = "Hello@123";
        
        if (sCheck1.matches(".*\\W.*")){
           System.out.println("Does contain a non word"); 
        }
        else
        {
          System.out.println("Does not contain a non word");  
        }
        
        String sEmail = "example@email.com";
        
        if (sEmail.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$")){
          System.out.println("Valid Email");    
        }
        else
        {
            System.out.println("Invalid Email");
        }
        
        String sCheck2 = "Do you have references123" ;
        
        if (sCheck2.matches(".*[\\d] + [\\s].*")){ //(W3schools , 2025)
           System.out.println("There are digits and whitespace characters"); 
        }
        else 
        {
          System.out.println("There are no digits nor whitespace characters");  
        }
  }
    
}


//Reference list

//w3Schools , 2025.Java RegEX [source code]. Available at: <https://www.w3schools.com/java/java_regex.asp> [Accessed 9 Apr. 2025].
//Online Source Code

//w3schools , 2025. Java RegEX [online]. Available at : 