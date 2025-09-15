/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjbubble2;

import javax.swing.JOptionPane;

/**
 *
 * @author DrxpS
 */
public class PrjBubble2 {

    public static void main(String[] args) {
        int[] Nums = {500 , 300 , 700 , 200 , 900};
        
        String smessage = "Numbers before sort\n~~~~~~~~~~~~~~~~~~\n";
        display_numbers(Nums , smessage);
        
        String sOption = JOptionPane.showInputDialog("Enter 1 to sort in ASC order and any other key for DESC");
        
        if (sOption.equals("1"))
        {
            Order_numbers(Nums , "Numbers sorted in ASC order \n","1");
        }else
        {
            Order_numbers(Nums , "Numbers sorted in DESC order \n",sOption);
        }
    }
    
    private static void Order_numbers(int[] nums , String sMessage , String sOption)
    {
        int Temp = 0;
        
        for (int index = 0; index < nums.length ; index++)
        {
            for (int i = 0; i < nums.length - 1; i++)
            {
                if (sOption.equals("1"))
                {
                    if (nums[i] > nums[i+1])
                    {
                        Temp = nums[i + 1];
                        nums[i + 1] = nums[i];
                        nums[i] = Temp;
                    }
                }
                else{
                        if (nums[i] < nums[i + 1])
                        {
                            Temp = nums[i + 1];
                            nums[i + 1] = nums[i];
                            nums[i] = Temp;
                        }
                    }
                
            }
        }
        display_numbers(nums , sMessage);
    }
    
    private static void display_numbers(int[] nums , String sMessage)
    {
        for (int i = 0; i < nums.length ; i++)
        {
            sMessage += "\nPosition " + (i + 1) + " : " + nums[i] + "\n";
        }
        
        JOptionPane.showMessageDialog(null, sMessage);
    }
}
