/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructorwithdefault;

/**
 *
 * @author giagkas
 */
public class Customer {
    private String firstName;
    private String lastName;
    private String account;
    private double balance;
    
    //constructor with default values
    public Customer (){
        this("Akuma","Devul","666.666",999.0);
    }
    //constructor with full parameters
    public Customer(String firstName, String lastName, String account, double balance){
        this.firstName=firstName;
        this.lastName=lastName;
        this.account=account;
        this.balance=balance;
    }
    
    //constructor with partially default parameters
    public Customer(double balance){
        this("Akuma","Devul","666.666",balance);
    }
    
    public void getInfo(){
        System.out.println(this.firstName);
        System.out.println(this.lastName);
        System.out.println(this.account);
        System.out.println(this.balance);
    }
}
