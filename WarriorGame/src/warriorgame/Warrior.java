/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warriorgame;

/**
 *
 * @author giagkas
 */
public class Warrior {
    private String name;
    private int health;
    private int attackPoints;
    private int defencePoints;
    
    public Warrior(String name, int health, int attackPoints, int defencePoints){
        this.name=name;
        this.health=health;
        this.attackPoints=attackPoints;
        this.defencePoints=defencePoints;
        
    }
    
    public int attack(){
        return 1+(int)(Math.random()*this.attackPoints);
    }
    
    public int block(){
        return 1+(int)(Math.random()*this.defencePoints);
    }
    
    public void takingDamage(int damage){
        this.health-=damage;
    }
    
    public String getName(){
        return this.name;
    }
    public int getHealth(){
        return this.health;
    }
}
