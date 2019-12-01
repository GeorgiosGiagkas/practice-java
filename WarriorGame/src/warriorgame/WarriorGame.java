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
public class WarriorGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        
        Warrior akuma= new Warrior("Akuma", 1600, 350, 50);
        Warrior ryu= new Warrior("Ryu", 2000, 250, 80);
        
        Battle.fight(akuma, ryu);
    }
    
}
