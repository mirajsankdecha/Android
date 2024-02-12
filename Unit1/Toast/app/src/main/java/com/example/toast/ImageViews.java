package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class ImageViews extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_views); // Assuming your layout file is named activity_image_views.xml

        ImageView img = findViewById(R.id.setImg);
        ImageButton andrd = findViewById(R.id.andrd);
        ImageButton asp = findViewById(R.id.asp);
        ImageButton net = findViewById(R.id.netw);

        andrd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.setImageResource(R.drawable.android_photo);
            }
        });

        asp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.setImageResource(R.drawable.asp_pho);
            }
        });

        net.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.setImageResource(R.drawable.net);
            }
        });
    }
}
