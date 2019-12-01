/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacechallenge;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author giagkas
 */
public class InterFaceChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Player myPlayer = new Player("Cloud", 1000, 99, 80, "OneHitKO!");
        
        System.out.println(myPlayer);
        
        saveObject(myPlayer);
        loadObject(myPlayer);
        System.out.println(myPlayer);
        
        
    }
    
    private static ArrayList<String> readValuesFromUser(){
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> myArrayList = new ArrayList<String>();
        int index=0;
        boolean quit=false;
        while(!quit){
            System.out.println("Enter choice:\n"+
                    "0:\tTo quit\n"+
                    "1:\tTo enter string!");
            boolean hasNextInt=scanner.hasNextInt();
            if(!hasNextInt){
                scanner.nextLine();
                System.out.println("Invalid value!");
                continue;
            }
            int choice=scanner.nextInt();
            scanner.nextLine();
            
            switch(choice){
                case 0:
                    System.out.println("Quiting program....");
                    quit=true;
                    break;
                case 1:
                    String userInput= scanner.nextLine();
                    myArrayList.add(index++,userInput);
                    System.out.println("Parsing string "+userInput+" to list!");                   
                    break;
                default:
                    break;
                        
            }
        }
        return myArrayList;
        
    }
    
    private static void saveObject(ISavable savable){
        for(int i=0;i<savable.write().size();i++){
            System.out.println("Saving object: "+savable.write().get(i)+" to storage device!");
        }
    }
    
    private static void loadObject(ISavable loadObject){
        ArrayList<String> myArrayList = readValuesFromUser();
        loadObject.read(myArrayList);
        
    }
    
}
