package com.timbuchalka;

import java.util.ArrayList;

public class MobilePhone {

  private String myNumber;
  private ArrayList<Contact> myContacts;

  public MobilePhone(String myNumber) {
    this.myNumber = myNumber;
    this.myContacts = new ArrayList<Contact>();
  }

  public boolean addNewContact(Contact contact) {

    if(findContact(contact) >= 0){
      System.out.println("Contact is already on file");
      return false;
    }
    Contact.createContact(contact.getName(), contact.getPhoneNumber());
    return true;
  }

  public boolean updateContact(Contact oldContact, Contact newContact){
    if(findContact(oldContact) < 0){
      System.out.println("That contact does not exist");
      return false;
    }else{
      myContacts.set(findContact(oldContact), newContact);
      return true;
    }
  }

  public boolean removeContact(Contact contact) {
    if(findContact(contact) >= 0){
      myContacts.remove(findContact(contact));
      return true;
    }else{
      System.out.println("That contact does not exist");
      return false;
    }
  }

  public Contact queryContact(String name) {
    int position = findContact(name);
    if(position >= 0){
      return myContacts.get(position);
    }
    return null;
  }

  public void printContacts(){
      for(int i = 0; i < myContacts.size(); i++){
        Contact contactItem = myContacts.get(i);
        System.out.println((i+1) + ". " + contactItem.getName() + " -> " + contactItem.getPhoneNumber());
      }
    }

  private int findContact(Contact contact){
    return myContacts.indexOf(contact.getName());
  }
  private int findContact(String contactName){
    for (int i = 0; i < myContacts.size(); i++) {
      if (myContacts.get(i).getName().equals(contactName)) return i;
    }
    return -1;
  }
}
