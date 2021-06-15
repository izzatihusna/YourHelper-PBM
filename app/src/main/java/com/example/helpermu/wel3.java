package com.example.helpermu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class wel3 extends AppCompatActivity {
    public Button btnmasuk3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wel3);

        btnmasuk3 = (Button) findViewById(R.id.btnmasuk3);
        btnmasuk3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(wel3.this, wel4.class));
                finish();
            }
        });
    }
}