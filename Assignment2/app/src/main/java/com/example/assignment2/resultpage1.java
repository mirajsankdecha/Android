package com.example.assignment2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class resultpage1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultpage1);
        TextView nm = findViewById(R.id.name);
        TextView en = findViewById(R.id.enrollnum);
        TextView py = findViewById(R.id.py);
        TextView mern = findViewById(R.id.mern);
        TextView ad = findViewById(R.id.adroid);
        TextView asp = findViewById(R.id.asp);
        TextView lvl = findViewById(R.id.laravel);
        TextView cs = findViewById(R.id.cs);
        Button btn = findViewById(R.id.btnsubmit);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),resultpage2.class);
                String nam = nm.getText().toString();
                String enoo = en.getText().toString();
                int pyy = Integer.parseInt(py.getText().toString());
                int mernn = Integer.parseInt(mern.getText().toString());
                int add = Integer.parseInt(ad.getText().toString());
                int aspp = Integer.parseInt(asp.getText().toString());
                int lvll = Integer.parseInt(lvl.getText().toString());
                int css = Integer.parseInt(cs.getText().toString());
                
            }
        });
    }
}