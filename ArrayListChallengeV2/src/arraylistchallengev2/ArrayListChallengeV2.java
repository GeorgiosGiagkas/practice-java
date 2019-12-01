/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistchallengev2;

import java.util.Scanner;

/**
 *
 * @author giagkas
 */
public class ArrayListChallengeV2 {

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
                        myMobile.printContacts();
                        break;
                    case 2:
                        addNewContact(myMobile);
                        break;
                    case 3:
                        if(updateContact(myMobile)){
                            System.out.println("Contact updated!");
                        }
                        else{
                            System.out.println("Contact does not exist!");
                        }
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

            } else {
                scanner.nextLine();
                System.out.println("Invalid value!");
            }
        }
    }

    public static void addNewContact(MobilePhone mobile) {
        System.out.println("Enter new contact name:");
        String inputContactName = scanner.nextLine();
        System.out.println("Enter phone number:");
        String inputContactPhone = scanner.nextLine();
        Contact contact = Contact.createContact(inputContactName, inputContactPhone);

        if (mobile.storeContact(contact)) {
            System.out.println("New contact has been added!");
        } else {
            System.out.println("Contact already exits!");
        }
    }
    public static boolean updateContact(MobilePhone mobile){
        System.out.println("Enter contact name:");
        String inputContactName = scanner.nextLine();
        System.out.println("Enter new phone number:");
        String inputContactPhone = scanner.nextLine();
        Contact contact = Contact.createContact(inputContactName, inputContactPhone);
        return mobile.modifyContact(inputContactName, contact);

    }
    public static void removeContact(MobilePhone mobile) {
        System.out.println("Input contact name to remove:");
        String inputContactName = scanner.nextLine();
        if (mobile.removeContact(inputContactName)) {
            System.out.println("Contact deleted!");
        } else {
            System.out.println("Contact does not exit!");
        }
    }
    
    public static void searchContact(MobilePhone mobile){
        System.out.println("Input contact name to search");
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
