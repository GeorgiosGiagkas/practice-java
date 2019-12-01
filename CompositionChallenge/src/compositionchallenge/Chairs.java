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
public class Chairs {
    private String color;
    private String material;
    
    public Chairs(String color, String material){
        this.color=color;
        this.material=material;
    }
    
    public String getColor(){
        return this.color;
    }
    public String getMaterial(){
        return this.material;
    }
    
    public String moveChair(){
        return "Chair is moving!";
    }
}
