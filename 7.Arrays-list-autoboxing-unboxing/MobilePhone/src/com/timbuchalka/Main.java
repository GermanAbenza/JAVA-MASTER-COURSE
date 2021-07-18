package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        MobilePhone myPhone = new MobilePhone("636645989");
        System.out.println(myPhone.addNewContact(new Contact("John", "12831231237812")));
        System.out.println(myPhone.addNewContact(new Contact("John", "12831231237812")));

        Contact contactAlphie = new Contact("Alphie", "12312312");
        Contact contactJohn = new Contact("John", "12312312");
        System.out.println(myPhone.updateContact(contactAlphie, new Contact("solomons", "123123123")));
        System.out.println(myPhone.updateContact(contactAlphie, new Contact("  ", "123123123")));

    }
}
