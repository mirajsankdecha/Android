package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Imp_and_Exp_Intent_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imp_and_exp_intent2);
        TextView t1 = findViewById(R.id.lblmsg);
        Intent i = getIntent();
        String name = i.getStringExtra("name");
        t1.setText("Hii " + name);
    }
}