package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class app_Life_cycle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
        Log.d("lifeCycle", "Created!!");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifeCycle", "Started!!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifeCycle", "Resume!!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifeCycle", "Paused!!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifeCycle", "Stopped!!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifeCycle", "Destroyed!!");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lifeCycle", "Restarted!!");
    }
}
