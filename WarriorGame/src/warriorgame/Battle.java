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
public class Battle {
    
    public static void fight(Warrior warriorA, Warrior warriorB) throws InterruptedException{
        while(true){
            if(attackResult(warriorA, warriorB).equals("Game Over!")){
                System.out.println("Game Over!");
                break;
            }
            if(attackResult(warriorB, warriorA).equals("Game Over!")){
                System.out.println("Game Over!");
                break;
            }
        }
        
    }
    
    private static String attackResult(Warrior warriorA, Warrior warriorB) throws InterruptedException{
        int damage = warriorA.attack()-warriorB.block();
        if(damage>0){
            warriorB.takingDamage(damage);
        }
        else{
            damage=0;
            warriorB.takingDamage(damage);
        }
        
        System.out.printf("%s attacks %s and deals %d damage!\n",warriorA.getName(),
                warriorB.getName(), damage);
        
        System.out.printf("%s has %d health remaining!\n", warriorB.getName(),warriorB.getHealth());
        
        System.out.println("");
        Thread.sleep(1500);
        
        if(warriorB.getHealth()<=0){
            System.out.printf("%s is Victorious!\n", warriorA.getName());
            return "Game Over!";
        }
        else{
            return "Next Round! Fight!";
        }
        
    }
    
}
