/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shareddigit;

/**
 *
 * @author giagkas
 */
public class SharedDigit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(12, 10));
        System.out.println(hasSharedDigit(22, 33));
        System.out.println(hasSharedDigit(12, 31));
        System.out.println(hasSharedDigit(15, 55));
        
        System.out.println(hasSharedDigit(101, 2222));
        System.out.println(hasSharedDigit(101, 1000));
        System.out.println(hasSharedDigit(155001, 222222));
        System.out.println(hasSharedDigit(155301, 22232222));
        
        
    }
    
    public static boolean hasSharedDigit(int numA, int numB){
//        if((numA<10 || numA>99) || (numB<10 || numB>99)){
//            return false;
//        }

        if(numA<10 || numB<10){
            return false;
        }
        
        int digitA=0;
        int digitB=0;
        int originalB=numB;//keep initial value of numB to reset
        while(numA>0){//condition
            digitA=numA%10;
            numA/=10;
            numB=originalB;//reset of numB before entering the while loop
            while(numB>0){//condition
                digitB=numB%10;
                numB/=10;
                if(digitB==digitA){
                    return true;
                }
            }
        }
        return false;
    }
    
}
