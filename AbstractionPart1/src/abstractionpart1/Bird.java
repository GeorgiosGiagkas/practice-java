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
public abstract class Bird extends Animal {
    public Bird(String name){
        super(name);
    }
    
    public abstract void canFly();


    @Override
    public void eat() {
        System.out.println("I can eat!");
        }
    
    
}
