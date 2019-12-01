/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistchallengev2;

import java.util.ArrayList;

/**
 *
 * @author giagkas
 */
public class MobilePhone {

    private String number;
    private ArrayList<Contact> contacts;

    public MobilePhone(String number) {
        this.number = number;
        this.contacts = new ArrayList<Contact>();
    }

    public boolean storeContact(Contact contact) {
        if (findPosition(contact) >= 0) {
            return false;
        }
        this.contacts.add(contact);
        return true;
    }

    public boolean removeContact(String name) {
        if (findPosition(name) < 0) {
            return false;
        }
        this.contacts.remove(findPosition(name));
        return true;
    }

    public boolean modifyContact(String name, Contact newContact) {
        if (findPosition(name) < 0) {
            return false;
        }

        this.contacts.set(findPosition(name), newContact);
        return true;
    }

    public void printContacts() {
        for (int i = 0; i < this.contacts.size(); i++) {
            System.out.println("Contact name: " + this.contacts.get(i).getName()
                    + "\tphone number: " + this.contacts.get(i).getPhoneNumber());
        }
    }

    public boolean queryContactName(String name) {
        if (findPosition(name) >= 0) {
            System.out.println("Contact exists!");
            System.out.println("Phone number: " + contacts.get(findPosition(name)).getPhoneNumber());
            return true;
        } else {
            return false;
        }
    }

    private int findPosition(Contact contact) {
        return findPosition(contact.getName());

    }

    private int findPosition(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equals(name)) {
                return i;
            }
            
        }
        return -1;
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }
    
    
}
