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
public class Carpet {
    private double cost;
    
    //constructor
    public Carpet(double cost){
        if(cost<0){
            this.cost=0;
        }
        else{
            this.cost=cost;
        }
    }
    
//    public void setCost(double cost){
//        if(cost<0){
//            this.cost=0;
//        }
//        else{
//            this.cost=cost;
//        }
//    }
    
    public double getCost(){
        return this.cost;
    }
}
