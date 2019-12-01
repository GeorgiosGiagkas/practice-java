/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greatestcommondivisor;

/**
 *
 * @author giagkas
 */
public class GreatestCommonDivisor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("GCD: "+ getGreatestCommonDivisor(25, 15));
        System.out.println("GCD: "+ getGreatestCommonDivisor(12, 30));
        System.out.println("GCD: "+ getGreatestCommonDivisor(9, 18));
        System.out.println("GCD: "+ getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor(int numA, int numB) {
        if (numA < 10 || numB < 10) {
            return -1;
        }

        //check lower number
        int lowerNumber = 0;
        
        if (numA < numB) {
            lowerNumber = numA;
           
        } else {
            lowerNumber = numB;
            
        }

        //
        int greatCommonDivisor = 0;
        for (int i = 2; i <= lowerNumber; i++) {
            if(numA%i==0 && numB%i==0){
                greatCommonDivisor=i;
            }
        }
        
        return greatCommonDivisor;
        
        

    }
}
