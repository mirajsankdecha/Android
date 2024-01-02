package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Calculator extends AppCompatActivity {

    private EditText operand1EditText;
    private EditText operand2EditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        operand1EditText = findViewById(R.id.operand1EditText);
        operand2EditText = findViewById(R.id.operand2EditText);

        Button addButton = findViewById(R.id.addButton);
        Button subtractButton = findViewById(R.id.subtractButton);
        Button multiplyButton = findViewById(R.id.multiplyButton);
        Button divideButton = findViewById(R.id.divideButton);
        Button clearButton = findViewById(R.id.clearButton);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                performOperation("Addition", "+");
            }
        });

        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                performOperation("Subtraction", "-");
            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                performOperation("Multiplication", "*");
            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                performOperation("Division", "/");
            }
        });

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clearOperands();
            }
        });
    }

    private void performOperation(String operation, String operator) {
        String operand1Str = operand1EditText.getText().toString();
        String operand2Str = operand2EditText.getText().toString();

        if (!operand1Str.isEmpty() && !operand2Str.isEmpty()) {
            double operand1 = Double.parseDouble(operand1Str);
            double operand2 = Double.parseDouble(operand2Str);

            double result = 0;

            switch (operator) {
                case "+":
                    result = operand1 + operand2;
                    break;
                case "-":
                    result = operand1 - operand2;
                    break;
                case "*":
                    result = operand1 * operand2;
                    break;
                case "/":
                    if (operand2 != 0) {
                        result = operand1 / operand2;
                    } else {
                        showToast("Cannot divide by zero");
                        return;
                    }
                    break;
            }

            showToast(operation + " Result: " + result);
        } else {
            showToast("Please enter both operands");
        }
    }

    private void clearOperands() {
        operand1EditText.setText("");
        operand2EditText.setText("");
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
