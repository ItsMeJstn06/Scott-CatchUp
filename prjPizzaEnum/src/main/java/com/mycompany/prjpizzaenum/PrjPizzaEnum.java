/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjpizzaenum;

/**
 *
 * @author DrxpS
 */
public class PrjPizzaEnum {
    
    enum PizzaSize{
        SMALL(16),
        MEDUIM(24),
        LARGE(32),
        EXTRA_LARGE(40);
    
    
    private final int diameter;
    
    PizzaSize(int diameter)
    {
        this.diameter = diameter;
    }
    
    public int getDiameter()
    {
        return diameter;
    }
    public int getSlice()
    {
        return diameter / 2;
    }

    }

    public static void main(String[] args) {
        
        PizzaSize myPizza = PizzaSize.MEDUIM;
        
        System.out.println("You ordered a " + myPizza + " pizza");
        System.out.println("Diameter : " + myPizza.getDiameter() + " cm\nPizza Slices : " + myPizza.getSlice());
        
        System.out.println("\nAll pizza details");
        
        for (PizzaSize size : PizzaSize.values())
        {
            System.out.println(size + " : " + size.getSlice() + " slices");
        }
               
    }
}
