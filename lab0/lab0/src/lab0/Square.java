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
public class Square extends Shape{
    private double length;
    private double height;
    
    public Square(String name){
        super(name);
        this.length = 0.0;
        this.height = 0.0;
    }
    
    public void setDimension(double l, double h)
    {
        this.length = l;
        this.height = h;
    }
    
    @Override
    /** return the area of the shape **/
    public double getArea(){
        return this.length * this.height;
    }
    
    @Override
    public void printDimensions()
    {
        System.out.println("Length: " + this.length + 
                            "Height: " + this.height);
    }
}
