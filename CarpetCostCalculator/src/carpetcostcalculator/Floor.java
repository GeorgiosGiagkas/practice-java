/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpetcostcalculator;

/**
 *
 * @author giagkas
 */
public class Floor {
    private double width;
    private double length;
    
    public Floor(double width,double length){
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
    
//    public void setWidth(double width){
//        if(width<0){
//            this.width=0;
//        }
//        else{
//            this.width=width;
//        }
//    }
//    
//    public void setLength(double length){
//        if(length<0){
//            this.length=0;
//        }
//        else{
//            this.length=length;
//        }
//    }
    
    public double getArea(){
        return this.length*this.width;
    }
}
