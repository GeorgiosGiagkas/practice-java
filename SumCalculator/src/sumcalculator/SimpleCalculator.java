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
public class SimpleCalculator {
    private double firstNumber;//field, instancce variable
    private double secondNumber;//field, instance variable
    
    
    public double getFirstNumber(){//accessor function
        return this.firstNumber;
    }
    public double getSecondNumber(){
        return this.secondNumber;//this pointer to instance created after object instansiation
    }
    
    public void setFirstNumber(double firstNumber){
        this.firstNumber=firstNumber;
    }
    public void setSecondNumber(double secondNumber){
        this.secondNumber=secondNumber;
    }
    
    public double getAdditionResult(){
        return this.firstNumber + this.secondNumber;
    }
    public double getSubtractionResult(){
        return this.firstNumber - this.secondNumber;
    }
    public double getMultiplicationResult(){
        return this.firstNumber * this.secondNumber;
    }
    public double getDivisionResult(){
        if(this.secondNumber==0){
            return 0;
        }
        return this.firstNumber / this.secondNumber;
    }
}
