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
            public void onClick(View v) {
                // Get the selected radio button's text
                int selectedRadioId = radioGroup.getCheckedRadioButtonId();
                RadioButton selectedRadioButton = findViewById(selectedRadioId);
                String gender = (selectedRadioButton != null) ? selectedRadioButton.getText().toString() : "Not selected";

                // Get the selected checkbox values
                String hobbies = "";
                if (cbAndroid.isChecked()) {
                    hobbies += "Android ";
                }
                if (cbMern.isChecked()) {
                    hobbies += "MERN Stack ";
                }
                if (cbDataScience.isChecked()) {
                    hobbies += "Data Science";
                }

                // Display a toast with the selected values
                String message = nm.getText().toString() + " " + gender + " " + hobbies;
                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
