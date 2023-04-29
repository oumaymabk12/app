package com.example.sportapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        EditText username = (EditText) findViewById(R.id.username);
        TextView have = findViewById(R.id.have);
        TextView ret=findViewById(R.id.retu);

        MaterialButton signupbtn = (MaterialButton) findViewById(R.id.btn);


        signupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username1=username.getText().toString() ;

                Toast.makeText(MainActivity3.this, "Username is "+username1 ,Toast.LENGTH_SHORT).show();

            }
        });
        have.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent have = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(have);
            }
        });
        ret.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ret = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(ret);
            }
        });

    }
}