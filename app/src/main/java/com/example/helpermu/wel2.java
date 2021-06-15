package com.example.helpermu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class wel2 extends AppCompatActivity {
    public Button btnmasuk2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wel2);

        btnmasuk2 = (Button) findViewById(R.id.btnmasuk2);
        btnmasuk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(wel2.this, wel3.class));
            finish();
            }
        });

    }
}
