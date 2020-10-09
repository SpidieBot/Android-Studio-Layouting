package com.example.gridlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView txtOutput = (TextView) findViewById(R.id.result);

        Intent intent = getIntent();
        float number1 = intent.getIntExtra("number1", 0);
        float number2 = intent.getIntExtra("number2", 0);
        String equation = intent.getStringExtra("equation");
        float value = 0;
        if (equation.equals("+")){
            value = (number1 + number2);
        }
        else if (equation.equals("-")){
            value = (number1 - number2);
        }
        else if (equation.equals("*")){
            value = (number1 * number2);
        }
        else if (equation.equals("/")){
            value = (number1 / number2);
        }
        String numberAsString = Float.toString(value);
        txtOutput.setText(numberAsString);



    }

    public void Back(View view) {
        Intent i_1 = new Intent(this, MainActivity.class);
        startActivity(i_1);
    }
}