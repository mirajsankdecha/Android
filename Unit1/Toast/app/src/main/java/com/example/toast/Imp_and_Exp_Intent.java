package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Imp_and_Exp_Intent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imp_and_exp_intent);
        Button b1 = findViewById(R.id.btnri);
        Button b2 = findViewById(R.id.btnci);
        EditText e1 = findViewById(R.id.tvnm);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://portfolio-master-sable-seven.vercel.app/"));
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),Imp_and_Exp_Intent_2.class);
                String name = e1.getText().toString();
                startActivity(i);
            }
        });
    }
}