package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EditText t1 = findViewById(R.id.tbname);
        EditText t2 = findViewById(R.id.tbpassword);
        EditText t3 = findViewById(R.id.tbemail);
        Button b1 = findViewById(R.id.btnsubmit);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=t1.getText().toString()+" "+t2.getText().toString()+" "+t3.getText().toString();
                Toast.makeText(Login.this, s, Toast.LENGTH_SHORT).show();

            }
        });
    }
}