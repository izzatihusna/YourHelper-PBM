package com.example.helpermu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class laundry7 extends AppCompatActivity {
    Button melatilaundry, btnback7, btnhubungi7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laundry7);

        melatilaundry = (Button) findViewById(R.id.melatilaundry);
        btnback7 = (Button) findViewById(R.id.btnback7);
        btnhubungi7 = (Button) findViewById(R.id.btnhubungi7);

        melatilaundry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(laundry7.this, menu1.class));
                finish();
            }
        });

        btnback7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(laundry7.this, menu1.class));
                finish();
            }
        });

        btnhubungi7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(laundry7.this, kontaklaundry7.class));
                finish();
            }
        });
    }
}