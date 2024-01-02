package com.example.toast;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Radio_Checkbox_Label extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_checkbox_label);

        Button btn = findViewById(R.id.btnsubmit);
        TextView nm = findViewById(R.id.lblname);
        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        CheckBox cbAndroid = findViewById(R.id.cbandroid);
        CheckBox cbMern = findViewById(R.id.cbmern);
        CheckBox cbDataScience = findViewById(R.id.cbdatadcience);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int radio = radioGroup.getCheckedRadioButtonId();
                RadioButton rd = findViewById(radio);
                String Gender = (rd!=null)?rd.getText().toString():"Not Selected";

                String Hoobie = "";
                if(cbAndroid.isChecked()) {
                    Hoobie+="Android";                }
                }
        });
    }
}
