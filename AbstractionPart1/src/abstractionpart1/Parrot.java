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
public class Parrot extends Bird{
    public Parrot(String name){
        super(name);
    }

    @Override
    public void canFly() {
        System.out.println("I can fly!");
    }

    @Override
    public void breath(){
        System.out.println("I am a parrot and i can breath!");;
    }
    
    
}
