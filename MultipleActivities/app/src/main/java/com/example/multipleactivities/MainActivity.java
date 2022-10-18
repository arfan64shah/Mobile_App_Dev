package com.example.multipleactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;
    public static final String EXTRA_MASSAGE = "com.example.variables.MASSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editTextTextPersonName);
        textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
    }

    public void sendMessage(View view){

        Intent intent = new Intent(this,DisplayMessageActivity.class);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MASSAGE,message);
        startActivity(intent);


    }

    public void firstExercise(View view){
//        EditText a = (EditText) findViewById(R.id.editTextTextPersonName);

        int n = Integer.parseInt(editText.getText().toString());
//        TextView textView  = (TextView) findViewById(R.id.textView);

//        String numbers=a.getText().toString();
//        int number = Integer.parseInt(numbers);
        String answer=" 0 \n 1 \n";

        int n1=0,n2=1,n3;
        while(n2<n)
        {
            n3=n1+n2;
            n1=n2;
            n2=n3;
            if (n2>n){
                break;
            }
            answer=answer+" "+ n3+"\n";
        }
        textView.setText(answer);


    }

}