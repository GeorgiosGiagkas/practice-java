/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largestprime;

/**
 *
 * @author giagkas
 */
public class LargestPrime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
        System.out.println(getLargestPrime(7));
        System.out.println(getLargestPrime(1));
    }
    
    public static int getLargestPrime(int num){
        if(num<=0){
            return -1;
        }
        
        int largestPrime=-1;
        boolean isPrime=true;
        for(int i=2;i<=num;i++){
            if(num%i==0){//check if i divides the number wholly
                
                isPrime=true;//reset to true to enter loop
                for(int j=2;j<i;j++){//check if it is prime
                    if(i%j==0){
                        isPrime=false;
                        break;
                    }
                }
                if(isPrime){//if it is prime
                    if(i>largestPrime){//check if is the largest
                        largestPrime=i;
                    }
                }
                
            }
           
        }
        return largestPrime;//returns -1 it has not a prime number
    }
    
}
