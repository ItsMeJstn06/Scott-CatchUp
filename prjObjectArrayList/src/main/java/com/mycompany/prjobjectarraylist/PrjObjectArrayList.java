/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjobjectarraylist;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author DrxpS
 */
public class PrjObjectArrayList {

    public static void main(String[] args) {
        ArrayList<Pet> pets = new ArrayList<>();
        
        String sName = JOptionPane.showInputDialog("enter pet name");
        int iAge =Integer.parseInt(JOptionPane.showInputDialog("Enter pet age"));
        
        Pet pet1 = new Pet(sName , iAge);
        pets.add(pet1);
        
        System.out.println("All Pet details");
        
        for (Pet pet : pets)
        {
            System.out.println(pet.displayPet());
        }
       
    }
}
