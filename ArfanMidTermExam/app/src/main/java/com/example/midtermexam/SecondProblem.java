package com.example.midtermexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondProblem extends AppCompatActivity {
    Button button7;
    Button button4;
    private TextView mTextViewResult2;
    private EditText mEditText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_problem);
        button7 = findViewById(R.id.button7);
        mTextViewResult2 = findViewById(R.id.textView3);
        mEditText2 = findViewById(R.id.editTextNumberSigned);
        button4 = findViewById(R.id.button4);



        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondProblem.this, MainActivity.class);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

         long num1 = Long.parseLong(mEditText2.getText().toString());
                double number, digit, sum = 0;
                while(num1 > 0)
                {
                    digit = num1 % 10;
                    sum = sum + digit;
                    num1 = num1 / 10;
                }

                mTextViewResult2.setText(String.valueOf("The sum is :" + sum));
            }
        });

    }


}