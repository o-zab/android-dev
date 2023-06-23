package com.example.translatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView family,number,color,phrase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        family = findViewById(R.id.family);
        number = findViewById(R.id.number);
        color = findViewById(R.id.color);
        phrase = findViewById(R.id.phrase);

//        set onClickListener for Family
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Family.class);
                startActivity(intent);
            }
        });
//        set onClickListener for number
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Numbers.class);
                startActivity(intent);
            }
        });
        //set onclicklistener for phrases
        phrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Phrases.class);
                startActivity(intent);
            }
        });

        //set onclicklistener for color
        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Colours.class);
                startActivity(intent);

            }
        });

    }
}