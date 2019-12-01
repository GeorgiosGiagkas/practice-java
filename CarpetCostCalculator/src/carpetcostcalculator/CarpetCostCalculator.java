/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpetcostcalculator;

/**
 *
 * @author giagkas
 */
public class CarpetCostCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75,4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("Get total cost: "+ calculator.getTotalCost());
        
        carpet= new Carpet(1.5);
        floor=new Floor(5.4,4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("Get total cost: "+ calculator.getTotalCost());
        
    }
    
}
