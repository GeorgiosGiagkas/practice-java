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
public class Bank {

    private String bankName;
    private ArrayList<Branch> branches;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addNewBranch(String name) {
        if (findBranch(name) < 0) {
            Branch branch = new Branch(name);
            this.branches.add(branch);
            return true;
        }
        return false;
    }

    public boolean addNewCustomerToBranch(String branchName, String customerName) {
        if (findBranch(branchName) >= 0) {
             return this.branches.get(findBranch(branchName)).addNewCustomer(customerName);
        }
        return false;
    }

    public boolean initializeTransaction(String branchName, String customerName, double amount) {
        if (findBranch(branchName) >= 0) {
            return this.branches.get(findBranch(branchName)).addInitialAmount(customerName, amount);

        }
        return false;
    }

    public boolean additianalTransaction(String branchName, String customerName, double amount) {
        if (findBranch(branchName) >= 0) {
            return this.branches.get(findBranch(branchName)).additionalAmount(customerName, amount);
        }
        return false;
    }

    public void showCustomers(String name) {
        if (findBranch(name) >= 0) {
            for (int i = 0; i < this.branches.get(findBranch(name)).getCostumers().size(); i++) {
                System.out.println("Customer Name: ");
                System.out.println(this.branches.get(findBranch(name)).getCostumers().get(i).getName());
            }
        } else {
            System.out.println("No customers for this branch!");
        }
    }

//    public void showTransactions(Branch branch,Customer customer){
//         
//        
//    }
    private int findBranch(String name) {
        for (int i = 0; i < this.branches.size(); i++) {
            if (this.branches.get(i).getBranchName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    //overloading
    private int findBranch(Branch branch) {
        return findBranch(branch.getBranchName());
    }

}
