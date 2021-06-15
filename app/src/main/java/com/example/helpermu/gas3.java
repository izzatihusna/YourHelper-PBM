package com.example.helpermu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gas3 extends AppCompatActivity {
    Button btnback, btnhubungi, btngas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gas3);

        btnback = (Button) findViewById(R.id.btnback);
        btnhubungi = (Button) findViewById(R.id.btnhubungi);
        btngas = (Button) findViewById(R.id.btngas);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(gas3.this, menu3.class));
                finish();
            }
        });
        btnhubungi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(gas3.this, kontakgas3.class));
                finish();
            }
        });
        btngas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(gas3.this, menu3.class));
                finish();
            }
        });
    }
}