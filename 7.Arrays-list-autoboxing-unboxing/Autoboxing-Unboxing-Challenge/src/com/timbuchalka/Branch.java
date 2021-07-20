package com.timbuchalka;

import java.util.ArrayList;

public class Branch {

  private String name;
  private ArrayList<Customer> customers;

  public Branch (String name){
    this.name = name;
    this.customers = new ArrayList<Customer>();
  }

  public String getName() {
    return this.name;
  }

  public ArrayList<Customer> getCustomers() {
    return customers;
  }

  public boolean newCustomer(String name, double transaction) {
    if(findCustomer(name) != null){
      System.out.println("Customer already exists");
      return false;
    }else{
      customers.add(new Customer(name, transaction));
      return true;
    }
  }

  public boolean addCustomerTransaction (String name, double transaction) {
    Customer customer = findCustomer(name);
    if(customer != null){
      customer.addTransaction(transaction);
      return true;
    }else{
      System.out.println("Customer " + name + " not found.");
      return false;
    }
  }

  private Customer findCustomer(String customerName){
    for(int i = 0; i < customers.size(); i++){
      if(customers.get(i).getName().equals(customerName)) {
        return customers.get(i);
      }
    }
    return null;
  }
}
