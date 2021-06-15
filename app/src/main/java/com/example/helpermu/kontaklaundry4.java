package com.example.helpermu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kontaklaundry4 extends AppCompatActivity {
    Button btnkembali4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kontaklaundry4);

        btnkembali4 =(Button) findViewById(R.id.btnkembali4);
        btnkembali4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(kontaklaundry4.this, laundry4.class));
                finish();
            }
        });
    }
}