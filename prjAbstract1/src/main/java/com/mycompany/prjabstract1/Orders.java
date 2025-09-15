/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjabstract1;

/**
 *
 * @author DrxpS
 */
public abstract class Orders {
    
    private String strProduct;
    private double dblPrice;
    private int intQty;

    public Orders(String strProduct, double dblPrice, int intQty) {
        this.strProduct = strProduct;
        this.dblPrice = dblPrice;
        this.intQty = intQty;
    }
    
    public double getTotalDue()
    {
        return dblPrice * intQty;
    }
    
    public String printReport()
    {
        return "INVOICE : \nProduct : " + strProduct + "\nQuantity : " + intQty + "\nTotal Due : R" + getTotalDue();
    }
}
