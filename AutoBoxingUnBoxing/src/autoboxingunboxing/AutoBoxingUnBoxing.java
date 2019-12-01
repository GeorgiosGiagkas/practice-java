/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoboxingunboxing;

import java.util.ArrayList;

/**
 *
 * @author giagkas
 */
public class AutoBoxingUnBoxing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //wrapping primative type inside class!!!Autoboxing
        ArrayList<Integer> myInteger = new ArrayList<Integer>();
        for(int i= 0; i< 10;i++){
            myInteger.add(Integer.valueOf(i));//this is autoboxing.Value of i returns an object of class Integer
            //Then that object is added to the arrayList (myInteger)
        }
        
        //unboxing 
        for(int i= 0;i<myInteger.size();i++){
            System.out.println(myInteger.get(i).intValue());//This is unboxing. get(i) returns an element
            //of the arrayList of Integer class object and then intValue returns the primative type int.
        }
        
        //3 ways to initialize
        
        //1.shorcut
        Integer i1 = 45;//which at compile time is traslated to:
        //2.
        Integer i2= Integer.valueOf(45);//which is like:
        //3.
        Integer i3= new Integer(45);
        
        
        System.out.println(i1+" "+i2+" "+i3);
    }
    
}
