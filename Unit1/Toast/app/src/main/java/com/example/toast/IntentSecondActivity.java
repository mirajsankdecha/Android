package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class IntentSecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_second);

        TextView t1 = findViewById(R.id.forname);
        TextView t2 = findViewById(R.id.forpassword);
        TextView t3 = findViewById(R.id.foremail);

        Intent i = getIntent();
        String nm = i.getStringExtra("Name");
        String ps = i.getStringExtra("Password");
        String em = i.getStringExtra("Email");

        t1.setText("Hi " + nm);
        t2.setText("Your Password is " + ps);
        t3.setText("Your Email is " + em);
    }
}
