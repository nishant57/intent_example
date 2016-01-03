package com.example.nishant.intentexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Apples extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apples);
    }

    public void onClick(View view){
        Intent i = new Intent(this, Bacon.class);
        EditText userInput1 = (EditText)findViewById(R.id.apples_input1);
        String applesMessage1 = userInput1.getText().toString();
        EditText userInput2 = (EditText)findViewById(R.id.apples_input2);
        String applesMessage2 = userInput2.getText().toString();
        i.putExtra("message1", applesMessage1);
        i.putExtra("message2", applesMessage2);
        startActivity(i);

    }
}
