/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floatdouble;

/**
 *
 * @author giagkas
 */
public class FloatDouble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //float takes 32 width(4bytes) same as integer
        float myFloat = 3.5f;
        
        //double takes 64 width(8bytes) same as long
        double myDouble = 3.5d;
        
        System.out.println("Float width is 32, same as integer. (4 bytes)");
        System.out.println("Double width si 64, same as long. (8 bytes)");
        
        System.out.println("Float: "+myFloat);
        System.out.println("Double: "+ myDouble);
        
        
    }
    
}
