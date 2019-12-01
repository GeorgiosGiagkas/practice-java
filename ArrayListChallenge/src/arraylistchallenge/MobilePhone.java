/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistchallenge;

import java.util.ArrayList;

/**
 *
 * @author giagkas
 */
public class MobilePhone {
    private String myPhoneNumber;
    private ArrayList<Contacts> contacts;
    
    
    public MobilePhone(String myPhoneNumber){
        this.myPhoneNumber=myPhoneNumber;
        this.contacts = new ArrayList<Contacts>();
        
    }
    
    private boolean hasContact(Contacts contact){
        if(this.contacts.contains(contact)){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void storeContact(Contacts contact){
        if(hasContact(contact)){
            System.out.println("Contact already exits!");
        }
        else{
            this.contacts.add(contact);
            System.out.println("New contact has been addded!");
        }
        
    }
    
    public void modifyContact(Contacts oldContact, Contacts newContact){
        if(hasContact(oldContact)&&(!hasContact(newContact))){
            int position=this.contacts.indexOf(oldContact);
            this.contacts.set(position, newContact);
            System.out.println("Contact modified!");
        }
        else if(!hasContact(oldContact)){
            System.out.println("No such contact exits!");
        }
        else if(hasContact(newContact)){
            System.out.println("Contact already exists!");
        }
        else{
            System.out.println("Cannot modify!");
        }
    }
    
//    public void removeContact(Contacts contact){
//        if(hasContact(contact)){
//            this.contacts.remove(contact);
//            System.out.println("Contact removed!");
//        }
//        else{
//            System.out.println("Contact does not exist! Cannot remove!");
//        }
//    }
    public boolean removeContact(Contacts contact){
        if(findPosition(contact)>=0){
            return false;
        }
        this.contacts.remove(findPosition(contact));
        return true;
    }
    private int findPosition(Contacts contact){
         return findPosition(contact.getName());
        
    }
   
    
    private int findPosition(String name){
        for(int i=0; i< contacts.size();i++){
            if(contacts.get(i).getName().equals(name));
            return i;
        }
        return -1;
    }
    
    public boolean queryContactName(String name){
        if(findPositions(name).isEmpty()){
            System.out.println("Contact NOT found!");
            return false;
        }
        System.out.println("Contact name found:");
        for(int i =0;i<findPositions(name).size();i++){
            System.out.println("Phone number "+(i+1)+": "+
                    this.contacts.get(findPositions(name).get(i)).getPhoneNumber());
        }
        
        return true;  
    }
    
    private ArrayList<Integer> findPositions(String name){
        ArrayList<Integer> myArrayList=new ArrayList<Integer>();
        for(int i=0; i<this.contacts.size();i++){
            if(this.contacts.get(i).getName().equals(name)){
                myArrayList.add(i);
            }           
        }
        return myArrayList;       
        }
        
    
    
    public void printContacts(){
        for(int i= 0 ; i < this.contacts.size();i++){
            System.out.println("Contact name: "+this.contacts.get(i).getName()
                    + "\tphone number: "+this.contacts.get(i).getPhoneNumber());
        }
    }
    
    
}
