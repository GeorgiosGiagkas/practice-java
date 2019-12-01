/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masterchallengelect50;

/**
 *
 * @author giagkas
 */
public class MasterChallengeLect50 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BasicHam myBH= new BasicHam("BigMac", "Soft", "Beaf",5.0);
        myBH.setHamAdd1("sause", 0.7);
        myBH.hamPriceTotal();
        
        HealthyBurger healthy = new HealthyBurger("brown", 4.2);
        healthy.setHamAdd4("ds", 1.2);
        healthy.hamPriceTotal();
        
        Deluxe deluxe = new Deluxe();
        deluxe.hamPriceTotal();
        deluxe.setHamAdd1("dfh", 1);
        
        
        
        
        
        
       
    }
    
}
