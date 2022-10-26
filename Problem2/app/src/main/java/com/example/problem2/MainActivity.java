package com.example.problem2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Sum(View view) {
        EditText n1 = (EditText) findViewById(R.id.editTextNumber);
        EditText n2 = (EditText) findViewById(R.id.editTextNumber2);

        long num = Long.parseLong(n1.getText().toString());

        long sum = 0;

        while (num != 0) {
            sum = sum + num % 10;
            num = num / 10;
        }

        n2.setText("Sum = " + sum);
    }
}