package com.example.multipleactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        editText = (EditText) findViewById(R.id.editTextTextPersonName6);
        textView = (TextView) findViewById(R.id.textView2);
    }

    public void GotoThird(View view){

        Intent intent = new Intent(this,ThirdActivity.class);
        startActivity(intent);


    }

    public void loopTree(View view){
        int n =  Integer.parseInt(editText.getText().toString());
        TextView textView  = (TextView) findViewById(R.id.textView2);
        String text = "";
        for (int i = n; i > 0; i--) {
            for (int j = i; j >0 ; j--) {
                text=text+"*";
            }
            text = text+"\n";
        }
        textView.setText(text);
    }
}