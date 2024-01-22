package com.example.assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class resultpage2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultpage2);

        String name = getIntent().getStringExtra("namme");
        String enroll = getIntent().getStringExtra("enrollnum");
        int pymark = getIntent().getIntExtra("py",0);
        int mernmark = getIntent().getIntExtra("mern",0);
        int adMarks = getIntent().getIntExtra("adroid", 0);
        int aspMarks = getIntent().getIntExtra("asp", 0);
        int lvlMarks = getIntent().getIntExtra("laravel", 0);
        int csMarks = getIntent().getIntExtra("cs", 0);
        int totalMarks = getIntent().getIntExtra("totalMarks", 0);
        double percentage = getIntent().getDoubleExtra("percentage", 0);
        String result = getIntent().getStringExtra("result");

        TextView nameTextView = findViewById(R.id.nameTextView);
        nameTextView.setText("Name: " + name);

        TextView enrollNumTextView = findViewById(R.id.enrollNumTextView);
        enrollNumTextView.setText("Enroll Number: " + enroll);

        TextView totalMarksTextView = findViewById(R.id.totalMarksTextView);
        totalMarksTextView.setText("Total Marks: " + totalMarks);

        TextView percentageTextView = findViewById(R.id.percentageTextView);
        percentageTextView.setText("Percentage: " + percentage + "%");

        TextView resultTextView = findViewById(R.id.resultTextView);
        resultTextView.setText("Result: " + result);
    }
}