package com.example.helpermu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class laundry3 extends AppCompatActivity {
    Button murahlaundry, btnback3, hubungimurah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laundry3);

        murahlaundry = (Button) findViewById(R.id.murahlaundry);
        btnback3 = (Button) findViewById(R.id.btnback3);
        hubungimurah = (Button) findViewById(R.id.hubungimurah);

        murahlaundry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(laundry3.this, menu1.class));
                finish();
            }
        });

        btnback3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(laundry3.this, menu1.class));
                finish();
            }
        });

        hubungimurah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(laundry3.this, kontaklaundry3.class));
                finish();
            }
        });
    }
}
