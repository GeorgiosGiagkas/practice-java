/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputthenprintsumaverage;

import java.util.Scanner;

/**
 *
 * @author giagkas
 */
public class InputThenPrintSumAverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long average = 0;
        int count = 0;
        while (true) {
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int num = scanner.nextInt();
                scanner.hasNextLine();
                sum += num;
                count++;
                average = (long) (sum / count);

            } else {
                System.out.println("SUM = "+sum+" AVR "+" = "+average);
                break;
            }
        }
    }

}
