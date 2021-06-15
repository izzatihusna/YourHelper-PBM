package com.example.helpermu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Doorsmeer4 extends AppCompatActivity {
    Button btnback, btnhubungi, btnbackdoorsmeer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doorsmeer4);
        btnback = (Button) findViewById(R.id.btnback);
        btnhubungi = (Button) findViewById(R.id.btnhubungi);
        btnbackdoorsmeer = (Button) findViewById(R.id.btnbackdoorsmeer);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Doorsmeer4.this, menu2.class));
                finish();
            }
        });
        btnhubungi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Doorsmeer4.this, kontakdoorsmeer4.class));
                finish();
            }
        });
        btnbackdoorsmeer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Doorsmeer4.this, menu2.class));
                finish();
            }
        });


    }
}