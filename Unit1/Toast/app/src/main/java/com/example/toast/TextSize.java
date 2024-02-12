package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class TextSize extends AppCompatActivity {

    private float textSize;
    private TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_size);
        t1 = findViewById(R.id.lblname);
        textSize = t1.getTextSize();

    }
    public void Inc(View view)
    {
        textSize+=5;
        t1.setTextSize(textSize);
    }
    public void  Dec(View view)
    {
        textSize-=5;
        t1.setTextSize(textSize);
    }
}