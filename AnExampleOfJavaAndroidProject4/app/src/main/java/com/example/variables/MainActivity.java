package com.example.variables;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    EditText editText2;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editTextTextPersonName);
        editText2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        textView = (TextView) findViewById(R.id.textView);
    }

    public void onButtonClick(View view) {
        Double x,y,z;
        x=Double.parseDouble(editText.getText().toString());
        y=Double.parseDouble(editText2.getText().toString());
        z = x + y;
        textView.setText("Result = " + Double.toString(z));
    }

}