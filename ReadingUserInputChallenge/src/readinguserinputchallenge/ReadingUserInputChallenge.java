/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readinguserinputchallenge;

import java.util.Scanner;

/**
 *
 * @author giagkas
 */
public class ReadingUserInputChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        int sumN = 0;
        int count = 1;
        while(count<=10){
            System.out.println("Enter number "+ count+" :");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                int num = scanner.nextInt();
                scanner.nextLine();
                sumN+=num;
                count++;
            }else{
                System.out.println("Invalid value!");
                scanner.nextLine();
            }
        }
        System.out.println("Sum is: "+ sumN);
        scanner.close();
    }
    
}
