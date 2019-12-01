/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pointtask;

/**
 *
 * @author giagkas
 */
public class Point {
    private int x;
    private int y;
    
    public Point(){};//empty constructor
    public Point(int x, int y){//constructor
        this.x=x;
        this.y=y;
    }
    
    //getters
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    
    //setters
    public void setX(int x){
        this.x=x;
    }
    
    public void setY(int y){
        this.y=y;
    }
    
    public double distance(){
        return Math.sqrt((0-this.x)*(0-this.x)+(0-this.y)*(0-this.y));
    }
    public double distance(int x, int y){
        return Math.sqrt((x-this.x)*(x-this.x)+(y-this.y)*(y-this.y));
    }
    
    public double distance(Point point){
        return Math.sqrt((point.x-this.x)*(point.x-this.x)+(point.y-this.y)*(point.y-this.y));
    }
}
