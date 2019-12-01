/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractionpart1;

/**
 *
 * @author giagkas
 */
public class AbstractionPart1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal myAnimal = new Dog("Pluto");
        //Dog myDog = new Dog("Pluto");//or that!
        myAnimal.breath();
        myAnimal.eat();
        System.out.println("My name is: "+myAnimal.getName());
    }
    
}
