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
public class Room {
    private String color;
    private Dimensions dimension;
    private Chairs chair;
    
    public Room(String color, Dimensions dimension, Chairs chair){
        this.color=color;
        this.dimension=dimension;
        this.chair=chair;
    }

    
    public String getColor(){
        return this.color;
    }
    public Dimensions getDimensions(){
        return this.dimension;
    }
    
    
    public void getChairChar(){
        System.out.println("Chair Color: "+chair.getColor());
        System.out.println("Chair Material: "+chair.getMaterial());
    }
    
    
    public void callChair(){
        System.out.println(chair.moveChair());
        
    }
    
    
}
