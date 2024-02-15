package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CRUD_Demo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crud_demo);
        DBHelper db=new DBHelper(CRUD_Demo.this);
    }
}