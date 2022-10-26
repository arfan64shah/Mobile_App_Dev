package com.example.prob1;

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

    public void Reverse(View view){
        EditText n1 = (EditText) findViewById(R.id.editTextNumber);
        EditText n2 = (EditText) findViewById(R.id.editTextNumber2);

        String num = n1.getText().toString();
        long x = Long.parseLong(num);
        char ch;
        String y=String.valueOf(x), nstr="";;
        for (int i=0; i<y.length(); i++)
        {
            ch= y.charAt(i);
            nstr= ch + nstr;
        }
        nstr = nstr.replace("", " ");
        n2.setText(nstr);

    }
}