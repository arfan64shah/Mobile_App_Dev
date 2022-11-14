package com.example.midexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Problem2 extends AppCompatActivity {
    Button button10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem2);

        button10 = (Button) findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Problem2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void Add(View v){
        EditText et1 = (EditText) findViewById(R.id.editTextNumber3);
        EditText et2 = (EditText) findViewById(R.id.editTextNumber4);
        EditText et3 = (EditText) findViewById(R.id.editTextNumber5);

        double n1 = Double.parseDouble(et1.getText().toString());
        double n2 = Double.parseDouble(et2.getText().toString());

        double result = n1+n2;

        et3.setText("Result: " + String.format("%.5f", result));
    }

    public void Subtract(View v){
        EditText et1 = (EditText) findViewById(R.id.editTextNumber3);
        EditText et2 = (EditText) findViewById(R.id.editTextNumber4);
        EditText et3 = (EditText) findViewById(R.id.editTextNumber5);

        double n1 = Double.parseDouble(et1.getText().toString());
        double n2 = Double.parseDouble(et2.getText().toString());

        double result = n1-n2;

        et3.setText("Result: " + String.format("%.5f", result));
    }
}