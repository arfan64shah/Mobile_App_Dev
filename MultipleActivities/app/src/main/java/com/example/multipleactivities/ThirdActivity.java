package com.example.multipleactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }

    public void thirdExercise(View view) {

        EditText editText3 = (EditText) findViewById(R.id.editTextTextPersonName3);
        EditText editText4 = (EditText) findViewById(R.id.editTextTextPersonName4);
        EditText editText5 = (EditText) findViewById(R.id.editTextTextPersonName5);
        String operator = String.valueOf(editText5.getText().toString());

        TextView textView3 = (TextView) findViewById(R.id.textView3);
        int firstNumber = Integer.parseInt(String.valueOf(editText3.getText()));
        int secondNumber = Integer.parseInt(String.valueOf(editText4.getText()));
        int result;
        if (operator.equals("+")){
            result = firstNumber+secondNumber;
            textView3.setText(editText3.getText()+" "+editText5.getText()+" "+editText4.getText()+" = "+String.valueOf(result));
        }else if(operator.equals("-")){
            result = firstNumber-secondNumber;
            textView3.setText(editText3.getText()+" "+editText5.getText()+" "+editText4.getText()+" = "+String.valueOf(result));
        }else if(operator.equals("/")){
            result = firstNumber/secondNumber;
            textView3.setText(editText3.getText()+" "+editText5.getText()+" "+editText4.getText()+" = "+String.valueOf(result));

        }else if(operator.equals("*")){
            result = firstNumber*secondNumber;
            textView3.setText(editText3.getText()+" "+editText5.getText()+" "+editText4.getText()+" = "+String.valueOf(result));

        }else if(secondNumber == 0){
            textView3.setText("Zero division");
        }else{
            textView3.setText("NO Operator"+operator);
        }

    }
}