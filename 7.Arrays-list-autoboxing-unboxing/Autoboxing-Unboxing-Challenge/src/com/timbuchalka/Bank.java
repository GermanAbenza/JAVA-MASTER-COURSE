package com.timbuchalka;

import java.util.ArrayList;

public class Bank {

  private String name;
  private ArrayList<Branch> branches;

  public Bank(String name) {
    this.name = name;
    this.branches = new ArrayList<>();
  }

  public boolean addBranch(String name) {
    Branch branch = findBranch(name);
    if(branch == null){
      Branch $name = new Branch(name);
      branches.add($name);
      return true;
    }else{
      System.out.println("Branch " + name + " already exists.");
      return false;
    }
  }

  public boolean addCustomer(String branchName, String customerName, double initialTransaction){
    Branch branch = findBranch(branchName);
    if(branch == null){
      System.out.println("Branch " + branchName + " not found.");
      return false;
    }
    return branch.newCustomer(customerName, initialTransaction);
  }

  public boolean addCustomerTransaction (String branchName, String customerName, double transaction){
    Branch branch = findBranch(branchName);
    if(branch == null){
      System.out.println("Branch " + branchName + " not found.");
      return false;
    }
    return branch.addCustomerTransaction(customerName, transaction);
  }

  private Branch findBranch(String branchName) {
    for (int i = 0; i < branches.size(); i++) {
      Branch branch = branches.get(i);
      if (branch.getName().equals(branchName)) {
        return branch;
      }
    }
    return null;
  }

  public boolean listCustomers(String branchName, boolean printTransactions){
    Branch branch = findBranch(branchName);
    if(branch != null){
      System.out.println("Customer details for branch " + branch.getName());

      ArrayList<Customer> customers = branch.getCustomers();
      for(int i = 0; i < customers.size() ; i++){

        System.out.println("Customer: " + customers.get(i).getName() + "["+ (i + 1) +"]");

        if(printTransactions){
          System.out.println("Transactions");

          ArrayList<Double> transactions = customers.get(i).getTransactions();

          for(int j = 0; j < transactions.size(); j++){
            System.out.println("["+ (j + 1) + "]  Amount " + transactions.get(j));
          }
        }
      }
      return true;
    }
    return false;
  }

}
