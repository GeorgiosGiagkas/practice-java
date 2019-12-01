/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoboxingunboxingchallenge;

import java.util.Scanner;

/**
 *
 * @author giagkas
 */
public class AutoboxingUnboxingChallenge {

    
    
    public static void main(String[] args) {
        Bank bank = new Bank("National Bank of H.P.Lovecraft");
        bank.addNewBranch("Horror of the abyss!");
        
        
        bank.addNewCustomerToBranch("Horror of the abyss!", "c'thulu");
        bank.initializeTransaction("Horror of the abyss!", "c'thulu", 6666); 
        bank.addNewCustomerToBranch("Horror of the abyss!", "Death");
        bank.addNewCustomerToBranch("Horror of the abyss!", "Death");
        
        bank.showCustomers("Horror of the abyss!");
        
        if(bank.addNewCustomerToBranch("Horror of the abyss!", "Death")){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    
    

    
    
}
