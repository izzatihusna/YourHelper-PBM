package com.example.helpermu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Doorsmeer3 extends AppCompatActivity {
    Button btnback, btnhubungi, btnbackdoorsmeer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doorsmeer3);

        btnback = (Button) findViewById(R.id.btnback);
        btnhubungi = (Button) findViewById(R.id.btnhubungi);
        btnbackdoorsmeer = (Button) findViewById(R.id.btnbackdoorsmeer);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Doorsmeer3.this, menu2.class));
                finish();
            }
        });
        btnhubungi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Doorsmeer3.this, kontakdoorsmeer3.class));
                finish();
            }
        });
        btnbackdoorsmeer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Doorsmeer3.this, menu2.class));
                finish();
            }
        });
    }
}