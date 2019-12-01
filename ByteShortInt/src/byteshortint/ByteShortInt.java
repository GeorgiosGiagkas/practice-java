/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byteshortint;

/**
 *
 * @author giagkas
 */
public class ByteShortInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //width is 32 for integer type(4bytes)
        int myInt=32;
        
        //width is 8 for byte
        byte myByte=8;
        
        //width is 16 for short(2bytes)
        short myShort=16;
        
        //width is 64 for long(8 bytes)
        long myLong=64;
    
        
        
        System.out.println("Width for byte is: "+myByte);
        System.out.println("Width for short is: "+myShort);
        System.out.println("Width for integer is: "+myInt);
        System.out.println("Width for long is: "+ myLong);
    }
    
    
}
