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
public class Circle {//one public class per document!!!
    private double radius;//field or intance variable
    
    public Circle(double radius){//constructor
        if(radius<0){
            this.radius=0;
        }
        else{
            this.radius=radius;
        }
    }
    
    public double getRadius(){
        return this.radius;
    }
    
    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }
    
}
