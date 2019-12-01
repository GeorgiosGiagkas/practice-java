/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylists;

import java.util.ArrayList;

/**
 *
 * @author giagkas
 */
public class ArrayLists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create an arrayList of Strings
        
        ArrayList<String> myArrayList = new ArrayList<String>();
        
        //add element at position
        myArrayList.add("Terminator");
        
        //get element at position
        System.out.println(myArrayList.get(0));
        
        //size of the ArrayList
        System.out.println(myArrayList.size());
        
        myArrayList.add("Bannana");
        
        //set at specific position
        myArrayList.set(1, "Spawn");
        
        //print
        for(int i =0 ; i<myArrayList.size();i++){
            System.out.println(myArrayList.get(i));
        }
        
        //remove element at specific position
        myArrayList.remove(1);
        
        //indexOf return the position of the element
        System.out.println(myArrayList.indexOf("Terminator"));
        
        //contains returns true if the arrayList contains the element given
        System.out.println(myArrayList.contains("Terminator"));
        
        
        //fill the arrayList
        String model = "Terminator ";
        for(int i =2 ; i<10;i++){
            myArrayList.add(model+i);
        }
        
        
        //copy contents of one array to another
        ArrayList<String> myNewArray = new ArrayList<String>();
        myNewArray.addAll(myArrayList);
         //print
        for(int i =0 ; i<myNewArray.size();i++){
            System.out.println(myNewArray.get(i));
        }
        
        
        //or copy at the point of initialisation
        ArrayList<String> myNewArray2= new ArrayList<String>(myArrayList);
        
        //copy to Array !!!
        String myArray[]= new String[myArrayList.size()];
        myArray=myArrayList.toArray(myArray);//does not contain reference to the ArrayList!!!!
        
        System.out.println(myArray[0]);
        myArray[0]="Modified!";//change
        System.out.println(myArray[0]);
        System.out.println(myArrayList.get(0));//does not change!!!!
    }
    
}
