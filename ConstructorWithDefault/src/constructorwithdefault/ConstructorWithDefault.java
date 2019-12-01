/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructorwithdefault;

/**
 *
 * @author giagkas
 */
public class ConstructorWithDefault {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Customer customer1 = new Customer();
        Customer customer2 = new Customer(1000);
        Customer customer3 = new Customer("Ryu", "Hadoken", "100.100", 20000);
        
        customer1.getInfo();
        customer2.getInfo();
        customer3.getInfo();
        
    }
    
}
