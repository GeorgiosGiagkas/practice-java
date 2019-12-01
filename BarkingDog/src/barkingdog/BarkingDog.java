/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barkingdog;

import jdk.nashorn.internal.parser.TokenType;

/**
 *
 * @author giagkas
 */
public class BarkingDog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
    }
    
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(hourOfDay<0 || hourOfDay>23){
            return false;
        }
        else if(barking && (hourOfDay<8 ||hourOfDay>22)){
            return  true;
        }
        else{
            return false;
        }
    
    }
    
}
