package com.example.helpermu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class laundry6 extends AppCompatActivity {
    Button mawarlaundry, btnback6, btnhubungi6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laundry6);

        mawarlaundry = (Button) findViewById(R.id.mawarlaundry);
        btnback6 = (Button) findViewById(R.id.btnback6);
        btnhubungi6 = (Button) findViewById(R.id.btnhubungi6);

        mawarlaundry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(laundry6.this, menu1.class));
                finish();
            }
        });

        btnback6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(laundry6.this, menu1.class));
                finish();
            }
        });

        btnhubungi6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(laundry6.this, kontaklaundry6.class));
                finish();
            }
        });
    }
}