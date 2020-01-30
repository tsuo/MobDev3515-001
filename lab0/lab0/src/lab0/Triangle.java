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
public class Triangle extends Shape{
    private double side1;
    private double side2;
    private double side3;
    public Triangle(String name)
    {
        super(name);
        this.side1 = 0.0;
        this.side2 = 0.0;
        this.side3 = 0.0;
    }
    
    public void setDimension(double s1, double s2, double s3)
    {
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }
    
    @Override
    /** return the area of the shape **/
    public double getArea(){
        double s = (0.5)*(this.side1 + this.side2 + this.side3);
        return Math.sqrt(s*(s-this.side1)*(s-this.side2)*(s-this.side3));
    }
    
    @Override
    public void printDimensions()
    {
        System.out.println("Side 1: " + this.side1 + 
                            "Side 2: " + this.side2 + 
                            "Side 3: " + this.side3 );
    }
}
