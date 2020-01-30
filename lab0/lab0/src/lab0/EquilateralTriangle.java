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
public class EquilateralTriangle extends Triangle{
    public EquilateralTriangle(String name)
    {
        super(name);
        super.setDimension(0.0, 0.0, 0.0);
    }
    
    public void setDimension(double s)
    {
        super.setDimension(s, s, s);
    }
}
