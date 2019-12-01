/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraychallenge;

import java.util.Scanner;

/**
 *
 * @author giagkas
 */
public class ArrayChallenge {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
//        int array1[] = new int[3];
//        int array2[]=array1;
//        
//        System.out.println(array1);
//        System.out.println(array2);
//        System.out.println(array1[0]);//same address!!!
//        System.out.println(array2[0]);//same addesss!!!
//        array2[0]=1;
//        System.out.println(array1[0]);
//        System.out.println(array2[0]);



        System.out.println("Enter integers: ");
        int array[]=getIntegers(5);
        System.out.println("Print integers:");
        printIntegers(array);
        int newArray[]=sortIntegers(array);
        System.out.println("Printeed sorted");
        printIntegers(newArray);

    }

    public static int[] getIntegers(int num) {
        int tempArray[] = new int[num];
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = scanner.nextInt();
        }

        return tempArray;
    }

    public static void printIntegers(int array[]) {
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static int[] sortIntegers(int array[]) {

        //array that collects idexes (initialized to -1)
        int tempArray[] = new int[array.length];
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = -1;
        }
        int countI=0;
        int countT=0;
        int sortedArray[] = new int[array.length];
        int countS=0;
        
        
        while(countS<sortedArray.length){
        int maxValue= Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (!containsElements(tempArray, i)) {
                if(array[i]>maxValue){
                    maxValue=array[i];                   
                    countI=i;
                }
            }
            
            
        }
        tempArray[countT++]=countI;
        sortedArray[countS++]=maxValue;
        }
        return sortedArray;

    }

    private static boolean containsElements(int array1[], int x) {
        for (int i : array1) {
            if (i == x) {
                return true;
            }
            
        }
        return false;

    }
}