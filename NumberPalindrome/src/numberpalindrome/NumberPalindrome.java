/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberpalindrome;

/**
 *
 * @author giagkas
 */
public class NumberPalindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        System.out.println(isPalindrome(0));
        System.out.println(isPalindrome(123));
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(-2332));
       
        
    }
    
    public static boolean isPalindrome(int number){
        if(number>-10 && number<10){
            return false;
        }
        
        if(number<0){
            number*=(-1);
        }
        
        int originalNumStored=number;
        int reverseNum=0;       
        
        while(number>0){
            reverseNum*=10;
            reverseNum+=(number%10);
            number/=10;
           
        }
        System.out.println("Number is: "+originalNumStored);
        System.out.println("Reverse is: "+reverseNum);
        if(originalNumStored==reverseNum){
            return true;
        }else{
            return false;
        }
        
    }
    
}
