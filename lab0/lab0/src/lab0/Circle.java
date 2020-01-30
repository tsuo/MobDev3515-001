/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab0;

/**
 *
 * @author tsuoi
 */
public class Circle extends Shape{
    private double radius;
    
    public Circle(String name)
    {
        super(name);
        this.radius = 0.0;
    }
    
    public void setDimension(double r)
    {
        this.radius = r;
    }
    
    @Override
    /** return the area of the shape **/
    public double getArea(){
        return Math.PI*(radius*radius);
    }
    
    @Override
    public void printDimensions()
    {
        System.out.println("Radius: " + this.radius);
    }
}
