package com.example.helpermu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kontaklaundry2 extends AppCompatActivity {
    Button btnkembali2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kontaklaundry2);

        btnkembali2 = (Button) findViewById(R.id.btnkembali2);
        btnkembali2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(kontaklaundry2.this, laundry2.class));
                finish();
            }
        });
    }
}