/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

/**
 *
 * @author giagkas
 */
public class Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //string is a Class, not a primative data type
        String myString = "Hello Brave New World!";
        
        String newString;//declare String variable
        newString= myString + 50;//treats 50 as sting to concatenate or
        int myInt = 50;
        newString = myString + myInt;
        System.out.println("Result: "+ newString);
    }
    
}
