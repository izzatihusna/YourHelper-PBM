package com.example.helpermu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kontaklaundry3 extends AppCompatActivity {
    Button btnkembali3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kontaklaundry3);
        btnkembali3 = (Button) findViewById(R.id.btnkembali3);
        btnkembali3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(kontaklaundry3.this, laundry3.class));
                finish();
            }
        });
    }
}