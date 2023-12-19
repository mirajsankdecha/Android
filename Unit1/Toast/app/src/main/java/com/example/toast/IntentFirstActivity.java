package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IntentFirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_first);

        EditText e1 = findViewById(R.id.tbname);
        EditText e2 = findViewById(R.id.tbpassword);
        EditText e3 = findViewById(R.id.tbemail);
        Button b1 = findViewById(R.id.btnsubmit);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = e1.getText().toString();
                String password = e2.getText().toString();
                String email = e3.getText().toString();

                Intent intent = new Intent(IntentFirstActivity.this, IntentSecondActivity.class);
                intent.putExtra("Name", name);
                intent.putExtra("Password", password);
                intent.putExtra("Email", email);

                startActivity(intent);
            }
        });
    }
}
