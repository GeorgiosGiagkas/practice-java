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
public abstract class Animal {//cannot be istastiated
    
    private final String name;

    public Animal(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }
    
    public abstract void breath();
    public abstract void eat();
    
    
    
    
}
