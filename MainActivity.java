package com.example.sportapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView have = (TextView) findViewById(R.id.signin);
        TextView dont = (TextView) findViewById(R.id.signup);


        have.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent have = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(have);
            }
        });
        dont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dont = new Intent(getApplicationContext(),MainActivity3.class);
                startActivity(dont);
            }
        });
    }
}