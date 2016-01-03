package com.example.nishant.intentexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Bacon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bacon);

        Bundle catchMessage = getIntent().getExtras();  //So it gets everything that was sent.
                                                        // What if multiple intents were sent?
                                                        // It is being differentiated later while getting the string.
        if (catchMessage == null){
            return;
        }

        String message1 = catchMessage.getString("message1");
        String message2 = catchMessage.getString("message2");
        TextView baconsText1 = (TextView)findViewById(R.id.bacon_textView1);
        TextView baconsText2 = (TextView)findViewById(R.id.bacon_textView2);
        baconsText1.setText(message1);
        baconsText2.setText(message2);
    }

    public void onClick(View view){
        Intent i = new Intent(this, Apples.class);
        startActivity(i);
    }
}

