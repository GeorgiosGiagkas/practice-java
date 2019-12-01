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
public class Customer {
    private String name;
    private ArrayList<Double> transactions;
    
    
    
    public Customer(String name){
        this.name=name;
        this.transactions = new ArrayList<Double>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
    
    
    public void setTransactions(double amount){
        this.transactions.add(Double.valueOf(amount));//autoboxing
    }
    
}
