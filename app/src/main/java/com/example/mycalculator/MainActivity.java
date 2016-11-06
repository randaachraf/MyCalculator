package com.example.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText1;
    EditText editText2;
    TextView textView;
    Button sum;
    Button subt;
    Button mult;
    Button divide;
    String s1;
    String s2;
    float num1;
    float num2;
    float Results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        textView = (TextView) findViewById(R.id.textView);
        sum = (Button) findViewById(R.id.sum);
        subt = (Button) findViewById(R.id.subt);
        mult = (Button) findViewById(R.id.mult);
        divide = (Button) findViewById(R.id.divide);
    }

    public void onClick(View view) {
        s1 = editText1.getText().toString();
        s2 = editText2.getText().toString();
        if (editText1.getText().toString().trim().equals("") || editText2.getText().toString().trim().equals(""))
            textView.setText("NO NUMBERS !!");
        else {
            num1 = Integer.parseInt(s1);
            num2 = Integer.parseInt(s2);
            switch (view.getId()) {
                case (R.id.sum):
                    Results = num1 + num2;
                    textView.setText(String.valueOf(Results));
                    break;
                case (R.id.subt):
                    Results = num1 - num2;
                    textView.setText(String.valueOf(Results));
                    break;
                case (R.id.mult):
                    Results = num1 * num2;
                    textView.setText(String.valueOf(Results));
                    break;
                case (R.id.divide):
                    if (num2 == 0) {
                        textView.setText("UNDEFINED !!");
                    } else {
                        Results = num1 / num2;
                        textView.setText(String.valueOf(Results));
                    }
                    break;

            }
        }
    }
}

