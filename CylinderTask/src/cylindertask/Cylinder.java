/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cylindertask;

/**
 *
 * @author giagkas
 */
public class Cylinder extends Circle {//Cylinder derived class from Circle parent class
    private double height;
    
    public Cylinder(double radius, double height){//constructor
        super(radius);//calls parent constructor to initialize radius
        this.height=height;//initialize height
    }
    
    public double getHeight(){
        return this.height;
    }
    
    public double getVolume(){
        return this.height*getArea();//call getArea 
    }
    
}
