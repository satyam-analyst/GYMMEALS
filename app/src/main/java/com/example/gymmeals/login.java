package com.example.gymmeals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login extends AppCompatActivity {
    Button selectmeal,backtologinpage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        selectmeal=(Button)findViewById(R.id.selectmeal);
        backtologinpage=(Button)findViewById(R.id.backtologinpage);

        selectmeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(login.this,chose.class);
                startActivity(i);
            }
        });
        backtologinpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(login.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}
