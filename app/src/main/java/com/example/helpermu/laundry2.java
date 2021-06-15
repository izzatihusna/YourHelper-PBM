package com.example.helpermu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class laundry2 extends AppCompatActivity {
    Button javalaundryback, btnback2, btnhubungi2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laundry2);

        javalaundryback = (Button) findViewById(R.id.javalaundryback);
        btnback2 = (Button) findViewById(R.id.btnback2);
        btnhubungi2 = (Button) findViewById(R.id.btnhubungi2);

        javalaundryback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(laundry2.this, menu1.class));
                finish();
            }
        });

        btnback2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(laundry2.this, menu1.class));
                finish();
            }
        });

        btnhubungi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(laundry2.this, kontaklaundry2.class));
                finish();
            }
        });
    }
}