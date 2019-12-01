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
public class CompositionChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dimensions myDimension = new Dimensions(120, 200, 100);
        Chairs myChair = new Chairs("red", "wooden");
        Room myRoom = new Room("black",myDimension,myChair);
        
        System.out.println(myRoom.getColor());
        
        //with getters
        System.out.println(myRoom.getDimensions().getHeight());
        System.out.println(myRoom.getDimensions().getWidth());
        System.out.println(myRoom.getDimensions().getLength());
        
      
        //without getters
        myRoom.callChair();
        myRoom.getChairChar();
        
    }
    
}
