package com.example.dbdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dbdemo.data.MyDbHAndler;
import com.example.dbdemo.model.Contact;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyDbHAndler db= new MyDbHAndler(MainActivity.this);

        //   Create a contact object for db
        Contact harry = new Contact();
        harry.setPhonenumber("test1");
        harry.setName("test1");
//        harry.setId(1);

        //  Adding a contact the db
        db.addContact(harry);

        //   Create a contact object for db
        Contact porry = new Contact();
        porry.setPhonenumber("test2");
        porry.setName("test2");
//        porry.setId(2);

        //  Adding a contact the db
        db.addContact(porry);


        //   Create a contact object for db
        Contact larry = new Contact();
        larry.setPhonenumber("test3");
        larry.setName("test3");
//        larry.setId(3);

        //  Adding a contact the db
        db.addContact(larry);
    }
}