package com.example.helpermu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kontakgalon7 extends AppCompatActivity {
    Button btnkembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kontakgalon7);

        btnkembali = (Button) findViewById(R.id.btnkembali);
        btnkembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(kontakgalon7.this, galon7.class));
                finish();
            }
        });
    }
}