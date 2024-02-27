package com.example.crudtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class updateAcronym extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_acronym);
        DBHelper db=new DBHelper(updateAcronym.this);
        Button update=findViewById(R.id.button1);
        EditText e1=findViewById(R.id.e1);
        EditText e2=findViewById(R.id.e2);
        Intent i=getIntent();
        e1.setText(i.getStringExtra("Acronym"));
        e2.setText(i.getStringExtra("Meaning"));
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data=i.getStringExtra("ID")+i.getStringExtra("Acronym")+i.getStringExtra("Meaning");
                db.updateData(i.getStringExtra("ID"),e1.getText().toString(),e2.getText().toString());
                Toast.makeText(updateAcronym.this, data, Toast.LENGTH_SHORT).show();
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
    }
}