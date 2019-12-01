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
public class Dog extends Animal{
    
    public Dog(String name){
        super(name);
    }

    @Override
    public void breath() {
        System.out.println("At last.I can breath!");
    }

    @Override
    public void eat() {
        System.out.println("Yammy!");
    }
    
    
}
