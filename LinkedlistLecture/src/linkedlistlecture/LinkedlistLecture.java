/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistlecture;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author giagkas
 */
public class LinkedlistLecture {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<String> myLinkedList = new LinkedList<String>();
        
        //add element at the end of  linked list
        myLinkedList.add("Thessaloniki");
        myLinkedList.add("Heraklio");
        myLinkedList.add("Athens");
        myLinkedList.add("Tripoli");
        myLinkedList.add("Chicago");
        myLinkedList.add("Lamia");
        myLinkedList.add("Patra");
        
        //add element in index with another element,
        myLinkedList.add(4, "Volos");
        
        //remove an element in the LinkedList
        myLinkedList.remove(4);
        
        printList(myLinkedList);
        
        System.out.println("\n==================================\n");
        //sort in order
        LinkedList<String> myLinkedList2 = new LinkedList<String>();
        
        //add element at the end of  linked list
        addInOrder(myLinkedList2,"Thessaloniki");
        addInOrder(myLinkedList2,"Heraklio");
        addInOrder(myLinkedList2,"Athens");
        addInOrder(myLinkedList2,"Tripoli");
        addInOrder(myLinkedList2,"Chicago");
        addInOrder(myLinkedList2,"Lamia");
        addInOrder(myLinkedList2,"Patra");
        addInOrder(myLinkedList2,"Patra");
        
        //print
        printList(myLinkedList2);
        
        System.out.println("\n==================================\n");
        printList(myLinkedList);
        System.out.println("\n==================================\n");
        
        visit(myLinkedList);
        
    }
    public static boolean addInOrder(LinkedList myLinkedList, String city){
            ListIterator<String> i = myLinkedList.listIterator();
            
            while(i.hasNext()){
                int compare= i.next().compareTo(city);
                if(compare==0){
                    System.out.println(city+ " is already added to the list!");
                    return false;
                }
                else if(compare >0){
                    i.previous();//using next at the begining actually moves to next, so previous to return.(previous is a mothod of listIterator not Iterator
                    i.add(city);
                    return true;
                }else if(compare<0){
                    //do nothing
                }
            }
            i.add(city);//if while loop ends without adding the city, then it is added at the end of the list
            return true;
        }
    
    public static void printList(LinkedList myLinkedList){
        //use iterator like a for loop
        Iterator<String> i = myLinkedList.iterator();
        while(i.hasNext()){
            System.out.println("Next city is: "+i.next());
        }
    }
    
    
    
    
    
    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        ListIterator<String> iterator = cities.listIterator();
        boolean quit=false;
        boolean goingForward=true;
        
        //check if linked list is empty else move to the first element using .next()
        if(cities.isEmpty()){
            System.out.println("Destination list is empty!");
        }
        else{
            System.out.println("Now visiting: "+iterator.next());
        }
        
        
        while(!quit){
            printMenu();
            boolean hasNextInt = scanner.hasNextInt();
            if(!hasNextInt){
                System.out.println("Invalid value!");
                scanner.nextLine();
                continue;
            }
            int userInput=scanner.nextInt();
            scanner.nextLine();
            
            switch(userInput){
                case 0:
                    System.out.println("Quiting application......");
                    quit=true;
                    break;
                    
                case 1:
                    //when you want to change direction
                    if(!goingForward){
                        if(iterator.hasNext()){
                            iterator.next();
                        }
                    }
                    goingForward=true;
                    
                    if(iterator.hasNext()){
                        System.out.println("Now visiting: "+iterator.next());
                    }
                    else{
                        System.out.println("Reached the end of the city list!");
                    }
                    break;
                    
                case 2:
                    // when you want to change direction
                    if(goingForward){
                        if(iterator.hasPrevious()){
                            iterator.previous();
                        }
                        goingForward=false;
                    }
                    
                    if(iterator.hasPrevious()){
                        System.out.println("Now visiting: "+iterator.previous());
                    }
                    else{
                        System.out.println("Reached the beginning of the city list!");
                    }
                    break;
                    
                case 3:
                    printMenu();
                    break;
            }
            
            
            
            
        }
        
    }
    
    private static void printMenu(){
        System.out.println("Press button:\n"
        +"0:\tTo quit!\n"
        +"1:\tTo visit next city!\n"
        +"2:\tTo visit previous city!\n"
        +"3:\tPrint menu!\n"
        +"==================================\n");
    }
    
}
