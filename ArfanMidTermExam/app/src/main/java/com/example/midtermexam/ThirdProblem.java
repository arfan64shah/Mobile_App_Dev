package com.example.midtermexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdProblem extends AppCompatActivity {
    Button button9;
    Button button8;
    private EditText mEditText3;
    private TextView mTextViewResult3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_problem);
        button9 = findViewById(R.id.button9);
        button8 = findViewById(R.id.button8);

        mEditText3 = findViewById(R.id.editTextNumberSigned2);
        mTextViewResult3 = findViewById(R.id.textView4);


        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThirdProblem.this, MainActivity.class);
                startActivity(intent);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double tax=0;
                int it = Integer.parseInt(mEditText3.getText().toString());

                if(it<=20000)
                    tax=0;
                else if(it<=40000)
                    tax=(0*(20000) + 0.1*(it-20000));

                else if(it<=60000)
                    tax=(0*(20000) + 0.1*(20000) + 0.2*(20000));
                else
                    tax=(0*(20000) + 0.1*(20000) + 0.2*(20000) + 0.3*(it-60000));
                mTextViewResult3.setText(String.valueOf("Payable tax is: "+ tax));
            }
        });
    }
}