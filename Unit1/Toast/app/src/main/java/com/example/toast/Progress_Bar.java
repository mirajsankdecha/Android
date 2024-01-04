package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;

public class Progress_Bar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);
        ProgressBar pb = findViewById(R.id.progressBar);
        Thread t= new Thread(){
          public void run()
          {
              for (int i = 0; i <pb.getMax() ; i++) {
                  pb.setProgress(i);
                  pb.setSecondaryProgress(i+5);
                  try {
                      Thread.sleep(500);
                  } catch (InterruptedException e) {
                      throw new RuntimeException(e);
                  }
              }
          }
        };
        t.start();
    }
}