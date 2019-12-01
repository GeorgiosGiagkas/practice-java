/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimalcomparator;

/**
 *
 * @author giagkas
 */
public class DecimalComparator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(areEqualByThreeDecimalPlaces(3.1, 3.2));
        System.out.println(areEqualByThreeDecimalPlaces(3.1, 3.1));
        System.out.println(areEqualByThreeDecimalPlaces(3.1, 3.10012));
        
        
        
    }
    
    public static boolean areEqualByThreeDecimalPlaces(double numA, double numB){
        int numAint=(int) (numA*1000);
        int numBint=(int) (numB*1000);
        if(numAint==numBint){
            return true;
        }else{
            return false;
        }
    }
    
}
