package com.example.helpermu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kontaklaundry7 extends AppCompatActivity {
    Button btnkembali2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kontaklaundry7);

        btnkembali2 = (Button) findViewById(R.id.btnkembali2);
        btnkembali2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(kontaklaundry7.this, laundry7.class));
                finish();
            }
        });
    }
}