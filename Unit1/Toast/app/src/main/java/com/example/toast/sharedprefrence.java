package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;

public class sharedprefrence extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sharedprefrence);
        SharedPreferences sp = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("Name","Miraj Sankdecha");
        editor.putInt("Enrollment",210801300);
        editor.putString("Class","C4");
        editor.commit();
    }
}