package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class ToggleButtonn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_buttonn);

        ToggleButton tb = findViewById(R.id.toggleButton);
        ImageView img = findViewById(R.id.imageView);

        tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tb.isChecked()) {
                    // Toggle is ON, show image2
                    img.setImageResource(R.drawable.red);
                } else {
                    // Toggle is OFF, show image1
                    img.setImageResource(R.drawable.blue);
                }
            }
        });
    }
}
