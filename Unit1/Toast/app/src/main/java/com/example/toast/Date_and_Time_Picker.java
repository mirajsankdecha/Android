package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class Date_and_Time_Picker extends AppCompatActivity {

    private TextView dateTextView;
    private TextView timeTextView;

    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_and_time_picker);

        dateTextView = findViewById(R.id.dateTextView);
        timeTextView = findViewById(R.id.timeTextView);

        DatePicker datePicker = findViewById(R.id.dp1);
        datePicker.setOnDateChangedListener((view, year, month, dayOfMonth) -> {
            dateTextView.setText(dayOfMonth + "/" + (month + 1) + "/" + year);
        });

        TimePicker timePicker = findViewById(R.id.tp1);
        timePicker.setOnTimeChangedListener((view, hourOfDay, minute) -> {
            timeTextView.setText(hourOfDay + ":" + minute);
        });
    }

    public void showDatePickerDialog(View view) {
        DatePicker datePicker = findViewById(R.id.dp1);
        datePicker.setVisibility(View.VISIBLE);

        TimePicker timePicker = findViewById(R.id.tp1);
        timePicker.setVisibility(View.GONE);
    }

    public void showTimePickerDialog(View view) {
        TimePicker timePicker = findViewById(R.id.tp1);
        timePicker.setVisibility(View.VISIBLE);

        DatePicker datePicker = findViewById(R.id.dp1);
        datePicker.setVisibility(View.GONE);
    }
}
