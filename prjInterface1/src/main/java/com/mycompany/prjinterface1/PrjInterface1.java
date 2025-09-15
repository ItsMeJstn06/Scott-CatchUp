/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjinterface1;

import javax.swing.JOptionPane;

/**
 *
 * @author DrxpS
 */
public class PrjInterface1 {

    public static void main(String[] args) {
        
        Rectangle r = new Rectangle(5, 10);
        Circle c = new Circle(3);
        
        JOptionPane.showMessageDialog(null, "Rectangle area : " + r.getArea() + "\n--------------------------------\nCircle area : " + c.getArea());
        
        
        Rectangle re = new Rectangle(5,10);
        Circle ce = new Circle(5);
        
    }
}
