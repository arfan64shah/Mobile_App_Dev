package com.example.midtermexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FirstProblem extends AppCompatActivity {
    private EditText mEditText1;
    Button button6;
    Button button5;
    private TextView mTextViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_problem);
        mEditText1 = findViewById(R.id.editTextNumberDecimal);
        mTextViewResult = findViewById(R.id.textView2);

        button6 = findViewById(R.id.button6);
        button5 = findViewById(R.id.button5);


        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstProblem.this, MainActivity.class);
                startActivity(intent);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                long num1 = Long.parseLong(mEditText1.getText().toString());

                mTextViewResult.setText(String.valueOf("The reverse is:" +reverse(num1)));
            }
        });

    }

    static long reverse(long n){

        long rev = 0;
        long rem;
        while(n>0){

            rem = n%10;
            rev = (rev*10) + rem;
            n = n/10;
        }
        return rev;
    }
}


