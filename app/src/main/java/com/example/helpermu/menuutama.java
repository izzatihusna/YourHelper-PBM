package com.example.helpermu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class menuutama extends AppCompatActivity {
    ImageButton imagebtn1, imagebtn2, imagebtn3, imagebtn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuutama);

        imagebtn1 = (ImageButton) findViewById(R.id.imagebtn1);
        imagebtn2 = (ImageButton) findViewById(R.id.imagebtn2);
        imagebtn3 = (ImageButton) findViewById(R.id.imagebtn3);
        imagebtn4 = (ImageButton) findViewById(R.id.imagebtn4);

        imagebtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(menuutama.this, menu1.class));
                finish();
            }
        });
        imagebtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(menuutama.this, menu2.class));
                finish();
            }
        });
        imagebtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {//belum diganti
                startActivity(new Intent(menuutama.this, menu3.class));
                finish();
            }
        });
        imagebtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {//belum diganti
                startActivity(new Intent(menuutama.this, menu4.class));
                finish();
            }
        });
    }
}