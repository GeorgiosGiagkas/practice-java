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
public class ComplexNumber {
    private double real;
    private double imaginary;
    
    //constructor
    public ComplexNumber(double real, double imaginary){
        this.real= real;
        this.imaginary= imaginary;
    }
    
    public double getReal(){
        return this.real;
    }
    
    public double getImaginary(){
        return this.imaginary;
    }
    
    public void add(double real, double imaginary){
        this.real+=real;
        this.imaginary+=imaginary;
    }
    
    public void add(ComplexNumber complexNumber){
        this.real+=complexNumber.real;
        this.imaginary+=complexNumber.imaginary;
    }
    
    public void subtract(double real, double imaginary){
        this.real-=real;
        this.imaginary-=imaginary;
    }
    
    public void subtract(ComplexNumber complexNumber){
        this.real-=complexNumber.real;
        this.imaginary-=complexNumber.imaginary;
    }
    
    
}
