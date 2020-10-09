package com.example.relativelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Next(View view)  {
        CountTotal();
    }

    private void CountTotal() {
        Intent i_1 = new Intent(this, Result.class);

        EditText editText1 = findViewById(R.id.number1);
        String temp1 = editText1.getText().toString();
        int value1=0;
        if (!temp1.equals("")){
            value1 = Integer.parseInt(temp1);
        }
        EditText editText2 = findViewById(R.id.number2);
        String temp2 = editText2.getText().toString();
        int value2=0;
        if (!temp2.equals("")){
            value2 = Integer.parseInt(temp2);
        }
        Spinner spinner = (Spinner) findViewById(R.id.equation);
        String equation = spinner.getSelectedItem().toString();

        i_1.putExtra("number1", value1);
        i_1.putExtra("number2", value2);
        i_1.putExtra("equation", equation);

        startActivity(i_1);
    }
}