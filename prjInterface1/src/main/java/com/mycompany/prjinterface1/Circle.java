/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjinterface1;

/**
 *
 * @author DrxpS
 */
public class Circle implements Shape{
    
    private double raduis;

    public Circle(double raduis) {
        this.raduis = raduis;
    }

    @Override
    public double getArea()
    {
        return (Math.PI * (raduis * raduis));
    }
}
