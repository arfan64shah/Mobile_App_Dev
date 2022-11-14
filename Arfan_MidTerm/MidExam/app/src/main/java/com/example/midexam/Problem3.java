package com.example.midexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Problem3 extends AppCompatActivity {
    Button button8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem3);

        button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Problem3.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void toDecimal(View v){
        EditText et1 = (EditText) findViewById(R.id.editTextNumber6);
        EditText et2 = (EditText) findViewById(R.id.editTextNumber7);

        int num = Integer.parseInt(et1.getText().toString());

        int decimalNumber = 0, i = 0;
        long remainder;

        while (num != 0) {
            remainder = num % 10;
            num /= 10;
            decimalNumber += remainder * Math.pow(2, i);
            ++i;
        }


        et2.setText("Decimal Equivalent: " + decimalNumber);
    }
}