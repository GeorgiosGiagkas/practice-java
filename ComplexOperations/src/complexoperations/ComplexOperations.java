/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complexoperations;

/**
 *
 * @author giagkas
 */
public class ComplexOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ComplexNumber one = new ComplexNumber(1.1, 1.1);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1, 1);
        System.out.println("one.real = "+one.getReal());
        System.out.println("one.imaginary = "+one.getImaginary());
        one.subtract(number);
        System.out.println("one.real = "+one.getReal());
        System.out.println("one.imaginary = "+one.getImaginary());
        
        
    }
    
}
