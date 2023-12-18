package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvContact;
    private ArrayList<String> contactList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        loadData();
        LictAdapter adapter = new LictAdapter(contactList);
        rvContact.setAdapter(adapter);
    }

    private void loadData() {
        contactList.add("1");
        contactList.add("2");
        contactList.add("3");
        contactList.add("4");
        contactList.add("5");
        contactList.add("6");
        contactList.add("7");
        contactList.add("8");
        contactList.add("9");
        contactList.add("10");
        contactList.add("11");
        contactList.add("12");
        contactList.add("13");
        contactList.add("14");
        contactList.add("115");
        contactList.add("111111111111111");


    }

    private void initView() {
        rvContact = findViewById(R.id.ym_list);
    }
}