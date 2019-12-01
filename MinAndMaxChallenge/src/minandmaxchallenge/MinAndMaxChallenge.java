/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minandmaxchallenge;

import java.util.Scanner;

/**
 *
 * @author giagkas
 */
public class MinAndMaxChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        int myMax = Integer.MIN_VALUE;
        int myMin = Integer.MAX_VALUE;
        
        while(true){
            System.out.println("Enter number: ");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                int num = scanner.nextInt();
                scanner.nextLine();
                if(num>myMax){
                    myMax = num;
                }
                if(num<myMin){
                    myMin = num;
                }
                
            }
            else{
                break;
            }
        }
        System.out.println("Max is = "+myMax);
        System.out.println("Min is = "+myMin);
        scanner.close();
    }
    
}
