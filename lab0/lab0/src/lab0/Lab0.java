/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab0;

import java.util.Scanner;

/**
 *
 * @author tsuoi
 */
public class Lab0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape[] shapes = new Shape[4];
        
        double s1, s2, s3;
        Square sh1;
        Circle sh2;
        Triangle sh3;
        EquilateralTriangle sh4;
        
        System.out.println("\n[SHAPE 1: SQUARE]");
        System.out.print("Length: ");
        s1 = sc.nextDouble();
        System.out.print("Height: ");
        s2 = sc.nextDouble();
        sh1 = new Square("Square");
        sh1.setDimension(s1, s2);
        
        System.out.println("\n[SHAPE 2: CIRCLE]");
        System.out.print("Radius: ");
        s1 = sc.nextDouble();
        sh2 = new Circle("Circle");
        sh2.setDimension(s1);
        
        System.out.println("\n[SHAPE 3: TRIANGLE]");
        System.out.print("Side 1: ");
        s1 = sc.nextDouble();
        System.out.print("Side 2: ");
        s2 = sc.nextDouble();
        System.out.print("Side 3: ");
        s3 = sc.nextDouble();
        sh3 = new Triangle("Triangle");
        sh3.setDimension(s1, s2, s3);
        
        System.out.println("\n[SHAPE 4: EQUILATERAL TRIANGLE]");
        System.out.print("Side: ");
        s1 = sc.nextDouble();
        sh4 = new EquilateralTriangle("Equilateral Triangle");
        sh4.setDimension(s1);
        
        shapes[0] = sh1;
        shapes[1] = sh2;
        shapes[2] = sh3;
        shapes[3] = sh4;
        for(Shape s : shapes){
            System.out.println("[" + s.getName() + "]\n" +
                                s.getArea() + "\n");
        }
    }
    
}
