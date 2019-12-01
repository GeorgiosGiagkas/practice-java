/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumcalculator;

/**
 *
 * @author giagkas
 */
public class SumCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4.0);
        System.out.println("Add: "+ calculator.getAdditionResult());
        System.out.println("Substract: "+ calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("Multiply:"+calculator.getMultiplicationResult());
        System.out.println("Division:"+calculator.getDivisionResult());
        
    }
    
}
