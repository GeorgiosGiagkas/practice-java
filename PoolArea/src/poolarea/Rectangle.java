/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poolarea;

/**
 *
 * @author giagkas
 */
public class Rectangle {
    private double width;
    private double length;
    
    public Rectangle(double width, double length){
        if(width<0){
            this.width=0;
        }
        else{
            this.width=width;
        }
        if(length<0){
            this.length=0;
        }
        else{
            this.length=length;
        }
    }
    
    public double getWidth(){
        return this.width;
    }
    public double getLength(){
        return this.length;
    }
    public double getArea(){
        return this.length*this.width;
    }
    
    
    
    
}
