/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositionchallenge;

/**
 *
 * @author giagkas
 */
public class Dimensions {
    private double height;
    private double width;
    private double length;
    
    public Dimensions(double height,double width, double length){
        this.height=height;
        this.width=width;
        this.length=length;
    }
    
    public double getHeight(){
        return this.height;
    }
    public double getWidth(){
        return this.width;
    }
    public double getLength(){
        return this.length;
    }
}
