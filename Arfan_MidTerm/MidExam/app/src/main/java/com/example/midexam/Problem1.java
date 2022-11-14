package com.example.midexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Problem1 extends AppCompatActivity {
    Button button7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem1);

        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Problem1.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void Factorial(View v){
        EditText et1 = (EditText) findViewById(R.id.editTextNumber);
        EditText et2 = (EditText) findViewById(R.id.editTextNumber2);

        int num = Integer.parseInt(et1.getText().toString());

        int i;
        long fact = 1;
        for(i = 1; i <= num; i++){
            fact = fact*i;
        }
        if (num <= 20 && num >=0){
            et2.setText("Factorial is: "+ fact);
        }else {
            et2.setText("Put numbers between 0 to 20");
        }
    }
}