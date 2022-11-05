package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    String num1, num2, op;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.textViewResult);
    }

    public void buttonClickFunction(View view) {
        if (view instanceof Button){
            Button button = (Button)view;
            String str = button.getText().toString();
            result.append(str);
        }
    }

    public void buttonAC(View view) {

        result.setText("");
    }

    public void buttonClickOp(View view) {
        Button button = (Button)view;
        op = button.getText().toString();
        num1 = result.getText().toString();
        buttonAC(view);
    }

    public void buttonClickCalc(View view) {
        num2 = result.getText().toString();

        double temp = 0;
        switch (op){
            case "+":
                temp = Double.parseDouble(num1) + Double.parseDouble(num2);
                break;
            case "X":
                temp = Double.parseDouble(num1) * Double.parseDouble(num2);
                break;
            case "-":
                temp = Double.parseDouble(num1) - Double.parseDouble(num2);
                break;
            case "÷":
                temp = Double.parseDouble(num1) / Double.parseDouble(num2);
                break;
        }
        if (temp % 1 == 0){
            int tempINT = (int)temp;
            result.setText(String.valueOf(tempINT));
        }
        else{
            result.setText(String.valueOf(temp));
        }


    }
}