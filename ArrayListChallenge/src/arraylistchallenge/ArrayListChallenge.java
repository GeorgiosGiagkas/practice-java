/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistchallenge;

import java.util.Scanner;

/**
 *
 * @author giagkas
 */
public class ArrayListChallenge {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        MobilePhone myMobile = new MobilePhone("6979085800");

        boolean quit = false;
        printMenu();
        while (!quit) {
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int action = scanner.nextInt();
                scanner.nextLine();
                switch (action) {
                    case 0:
                        System.out.println("Turning mobile off!");
                        quit = true;
                        break;
                    case 1:
                        listContacts(myMobile);
                        break;
                    case 2:
                        addNewContact(myMobile);
                        break;
                    case 3:
                        System.out.println("update");
                        break;
                    case 4:
                        removeContact(myMobile);
                        break;
                    case 5:
                        searchContact(myMobile);
                        break;
                    case 6:
                        printMenu();
                        break;
                    default:
                        System.out.println("Invalid value!");
                        break;
                }

            }
            else{
                scanner.nextLine();
                System.out.println("Invalid value!");
            }
        }

    }

    public static void addNewContact(MobilePhone mobile) {
        System.out.println("Add new contact name:");
        String inputContactName = scanner.nextLine();
        System.out.println("Add new contact phone number:");
        String inputContactPhone = scanner.nextLine();
        Contacts contact = new Contacts(inputContactName, inputContactPhone);
        mobile.storeContact(contact);
    }
    
    public static void removeContact(MobilePhone mobile) {
        System.out.println("Input contact name:");
        String inputContactName = scanner.nextLine();
        System.out.println("Input phone number:");
        String inputContactPhone = scanner.nextLine();
        Contacts contact = new Contacts(inputContactName, inputContactPhone);
        mobile.removeContact(contact);
    }

    public static void listContacts(MobilePhone mobile) {
        mobile.printContacts();
    }

    public static void searchContact(MobilePhone mobile) {
        System.out.println("Search contact name:");
        String inputContactName = scanner.nextLine();
        mobile.queryContactName(inputContactName);
    }

    public static void printMenu() {
        System.out.println("Press button:\n"
                + "0:\tTo quit.\n"
                + "1:\tTo print list of contacts.\n"
                + "2:\tTo add new contact.\n"
                + "3:\tTo update existing contact.\n"
                + "4:\tTo remove existing contact.\n"
                + "5:\tTo search/find contact.\n"
                + "6:\tTo print the menu.");
    }

}
