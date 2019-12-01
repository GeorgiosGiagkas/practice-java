/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumdigitschallenge;

/**
 *
 * @author giagkas
 */
public class SumDigitsChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Result: "+sumDigits(102));
        System.out.println(1%10);//result 1
        System.out.println(2%10);//result 2
        System.out.println(9%10);//result 9
    }
    public static int sumDigits(int number){
        if(number<10){
            return -1;
        }
        int sumN=0;
        while(number>0){
            sumN+=number%10;
            System.out.println("sumN= "+sumN);
            number/=10;
            System.out.println("number= "+number);
        }
        return sumN;
    }
    
}
