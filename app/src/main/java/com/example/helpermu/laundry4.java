package com.example.helpermu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class laundry4 extends AppCompatActivity {
    Button cleanlaundry, btnback4, btnhubungi4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laundry4);

        cleanlaundry = (Button) findViewById(R.id.cleanlaundry);
        btnback4 = (Button) findViewById(R.id.btnback4);
        btnhubungi4 = (Button) findViewById(R.id.btnhubungi4);

        cleanlaundry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(laundry4.this, menu1.class));
                finish();
            }
        });

        btnback4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(laundry4.this, menu1.class));
                finish();
            }
        });

        btnhubungi4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(laundry4.this, kontaklaundry4.class));
                finish();
            }
        });
    }
}