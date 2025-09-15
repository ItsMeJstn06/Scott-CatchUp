/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjarraylist;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author DrxpS
 */
public class PrjArrayList {

    private static ArrayList<String> names = new ArrayList<>();
    //private static ArrayList names = new ArrayList();
    
    public static void main(String[] args) {
       
        loadArray();
        
        PrintArray();
        
        sortArray();
    }
    
    private static void loadArray()
    {
        names.add("Justin");
        names.add("Scott");
        names.add("Clayton");
        names.add("Rian");
        names.add("Duvan");
        names.add("Mia");
        names.add("V");
        names.add("Martin");
        names.add("Divan");
        names.add("Wian");
        names.add("Hanno");
    }
    
    
    private static void PrintArray()
    {
        String Display = "My friends : \n ~~~~~~~~~~~~~~~~~~~\n";
        
        for (int i = 0 ; i < names.size() ; i ++)
        {
            Display += names.get(i) + "\n";
        }
        
        JOptionPane.showMessageDialog(null,Display);
    }
    
    
    private static void sortArray()
    {
        String Display = "Sorted List of Friends : \n";
       names.sort((a , b) -> Integer.compare(a.length(), b.length()));
        
        for (String name : names)
        {
            Display += name + "\n";
        }
        
        JOptionPane.showMessageDialog(null, Display);
        
        
    }
}


