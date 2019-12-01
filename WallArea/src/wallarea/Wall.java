/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wallarea;

/**
 *
 * @author giagkas
 */
public class Wall {
    private double width;
    private double height;
    
    //empty constructor
    public Wall(){};
    
    //costructor that calles setter method. It is not recomended, due to issues with inheritence
    public Wall(double width,double height){
        setWidth(width);
        setHeight(height);
    }
    //setters
    public void setWidth(double width){
        if(width<0){
            this.width=0;
        }
        else{
            this.width=width;
        }
    }
    
    public void setHeight(double height){
        if(height<0){
            this.height=0;
        }
        else{
            this.height=height;
        }
    }
    
    //getters
    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }
    
    //method 
    public double getArea(){
        return this.height*this.width;
    }
}
