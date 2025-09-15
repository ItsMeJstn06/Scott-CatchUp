/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjinterface;

/**
 *
 * @author DrxpS
 */
public class ProcessOrder implements Order{
    
    private int Amount;
    private double Price = 0.0 , Total = 0.0;
    
    @Override
    public void setAmount(int fAmount)
    {
        Amount = fAmount;
    }
    @Override
    public void setPrice(double fPrice)
    {
        Price = fPrice;
    }
    @Override
    public double getTotal()
    {
        Total = Amount * Price;
        return Total;
    }
    
}
