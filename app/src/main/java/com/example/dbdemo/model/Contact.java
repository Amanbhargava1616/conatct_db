package com.example.dbdemo.model;

public class Contact {
    private static int id=0;
    private String name;
    private String phonenumber;

//    static{
//        id=0;
//    }
//    public Contact( String name, String phonenumber) {
//        this.name = name;
//        this.phonenumber = phonenumber;
//        Contact.id++;
//
//    }

//    public Contact(int id, String name, String phonenumber) {
//        this.id = id;
//        this.name = name;
//        this.phonenumber = phonenumber;
//    }

    public Contact() {
        Contact.id++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}