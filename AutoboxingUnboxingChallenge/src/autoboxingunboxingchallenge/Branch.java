/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoboxingunboxingchallenge;

import java.util.ArrayList;

/**
 *
 * @author giagkas
 */
public class Branch {
    private String branchName;
    private ArrayList<Customer> costumers;
    
    public Branch(String branchName){
        this.branchName=branchName;
        this.costumers= new ArrayList<Customer>();
        
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCostumers() {
        return costumers;
    }
    
    public boolean addInitialAmount(String name,double amount){
        if(checkInitialTransaction(name)>=0){
            this.costumers.get(findPosition(name)).setTransactions(amount);
            return true;
        }
        return false;
    }
    
    public boolean additionalAmount(String name,double amount ){
        if(checkInitialTransaction(name)<0 && findPosition(name)>=0){
            this.costumers.get(findPosition(name)).setTransactions(amount);
            return true;
        }
        return false;
    }
    
    public boolean addNewCustomer(String name){
        if(findPosition(name)<0){
            Customer customer = new Customer(name);
            this.costumers.add(customer);
            return true;
        }
        return false;
    }
    
    private int findPosition(String name){
        for(int i=0; i< this.costumers.size();i++){
            if(costumers.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
    
    //overloading
    private int findPosition(Customer customer){
        return findPosition(customer.getName());
    }
    
    private int checkInitialTransaction(String name){
        if(findPosition(name)>=0){
            if(this.costumers.get(findPosition(name)).getTransactions().isEmpty()){
                return findPosition(name);
            }
        }
        
        return -1;
    }
}
