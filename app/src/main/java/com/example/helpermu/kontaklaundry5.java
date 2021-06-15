package com.example.helpermu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kontaklaundry5 extends AppCompatActivity {
    Button btnkembali2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kontaklaundry5);

        btnkembali2 = (Button) findViewById(R.id.btnkembali2);
        btnkembali2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(kontaklaundry5.this, laundry5.class));
                finish();
            }
        });
    }
}