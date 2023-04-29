package com.example.sportapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView username =(TextView) findViewById(R.id.username);
        TextView password =(TextView) findViewById(R.id.password);
        TextView crtbtn = (TextView) findViewById(R.id.crtbtn) ;
        TextView rtn =(TextView)findViewById (R.id.retun);


        MaterialButton loginbtn =(MaterialButton) findViewById(R.id.loginbtn);

        /*loginbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    Toast.makeText(MainActivity2.this, "LOGIN SUCCESSFUL" ,Toast.LENGTH_SHORT).show();
                }else
                    Toast.makeText(MainActivity2.this, "LOGIN FAILED !!!" ,Toast.LENGTH_SHORT).show();
            }
        });*/
        crtbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent crtbtn = new Intent(getApplicationContext(),MainActivity3.class);
                startActivity(crtbtn);
            }
        });
        rtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rtn = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(rtn);
            }
        });
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginbtn = new Intent(getApplicationContext(),MainActivity4.class);
                startActivity(loginbtn);
            }
        });

    }
}