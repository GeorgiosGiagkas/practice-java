/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readinguserinput;

import java.util.Scanner;

/**
 *
 * @author giagkas
 */
public class ReadingUserInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scanner = new Scanner(System.in);//instantiate class. Object scanner.

        System.out.println("Enter number: ");

        boolean hasNextInt = scanner.hasNextInt();//return true if user input is integer
        if (hasNextInt) {
            int myInt = scanner.nextInt();//assign integer user input to int variable
            scanner.nextLine();//handles next line (enter)

            System.out.println("Number entered: " + myInt);
            //////////
            System.out.println("Enter number as string: ");
            String myNewString = scanner.nextLine();
            int myStringToInt = Integer.parseInt(myNewString);//parse string as integer.(using static method of class Integer
            System.out.println("Sum of  5 + " + myNewString + " = " + (5 + myStringToInt));

            ///////////
            System.out.println("Enter string: ");
            String myString = scanner.nextLine();//next line return line passed as string

            System.out.println("The string entered was: " + myString);
        }else{
            System.out.println("Invalid value!");
        }
        scanner.close();//free memory allocated.
    }

}
