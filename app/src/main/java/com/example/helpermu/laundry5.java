package com.example.helpermu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class laundry5 extends AppCompatActivity {
    Button bungalaundry, btnback5, btnhubungi5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laundry5);

        bungalaundry = (Button) findViewById(R.id.bungalaundry);
        btnback5 = (Button) findViewById(R.id.btnback5);
        btnhubungi5 = (Button) findViewById(R.id.btnhubungi5);

        bungalaundry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(laundry5.this, menu1.class));
                finish();
            }
        });

        btnback5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(laundry5.this, menu1.class));
                finish();
            }
        });

        btnhubungi5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(laundry5.this, kontaklaundry5.class));
                finish();
            }
        });
    }
}