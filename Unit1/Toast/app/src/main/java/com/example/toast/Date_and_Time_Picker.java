package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;

public class Date_and_Time_Picker extends AppCompatActivity {

    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_and_time_picker);
        DatePicker dt = findViewById(R.id.dp1);
        TextView t = findViewById(R.id.tv1);
        dt.setOnDateChangedListener(new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker datePicker, int year, int month, int day) {
                t.setText(day+"/"+(month + 1)+"/"+year);
            }
        });
    }
}