package com.example.helpermu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class wel4 extends AppCompatActivity {
    Button btnmasuk4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wel4);
        btnmasuk4=(Button) findViewById(R.id.btnmasuk4);
        btnmasuk4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(wel4.this, menuutama.class));
                finish();
            }
        });
    }
}