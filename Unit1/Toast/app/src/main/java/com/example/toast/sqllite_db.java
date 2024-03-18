package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class sqllite_db extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqllite_db);
        Button insert  = findViewById(R.id.btnins);
        Button update = findViewById(R.id.btnupdate);
        Button delete = findViewById(R.id.btndelete);
        Button view  = findViewById(R.id.btnview);
        EditText tv1 = findViewById(R.id.tbid);
        EditText tv2 = findViewById(R.id.tbname);
        TextView tv0 = findViewById(R.id.lbldisp);

        DBHelper db = new DBHelper(sqllite_db.this);
        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id = tv1.getText().toString();
                String name = tv2.getText().toString();
                db.insertData(id,name);
            }
        });
    }
}