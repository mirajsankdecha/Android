package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class Spinerr extends AppCompatActivity {
    //String ct[] = {"Rajkot","Baroda","Surat","Dwarka","Gandhinagar","Ahmedabad","Una"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinerr);

        Button gb = findViewById(R.id.go_main);
        gb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Home_Page.class);
                startActivity(i);
            }
        });

        Spinner sp = findViewById(R.id.ct_spinner);
        // ArrayAdapter<String> adpt = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, ct);
        ArrayAdapter<CharSequence> adpt = ArrayAdapter.createFromResource(this, R.array.ct, android.R.layout.simple_spinner_item);
        adpt.setDropDownViewResource(android.R.layout.simple_list_item_multiple_choice);
        sp.setAdapter(adpt);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String item = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(Spinerr.this, item, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }
}
