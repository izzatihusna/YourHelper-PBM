package com.example.helpermu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class menu1 extends AppCompatActivity {
    Button btnback, btnmenu8, btnmenu9, btnmenu10, btnmenu11;
    ImageButton btnmenu5,btnmenu6,btnmenu7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu1);

        btnback = (Button) findViewById(R.id.btnback);
        btnmenu8 = (Button) findViewById(R.id.btnmenu8);
        btnmenu9 = (Button) findViewById(R.id.btnmenu9);
        btnmenu10 = (Button) findViewById(R.id.btnmenu10);
        btnmenu11= (Button) findViewById(R.id.btnmenu11);
        btnmenu5= (ImageButton) findViewById(R.id.btnmenu5);
        btnmenu6= (ImageButton) findViewById(R.id.btnmenu6);
        btnmenu7= (ImageButton) findViewById(R.id.btnmenu7);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(menu1.this, menuutama.class));
                finish();
            }
        });
        btnmenu8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(menu1.this, laundry1.class));
                finish();
            }
        });
        btnmenu9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(menu1.this, laundry2.class));
                finish();
            }
        });
        btnmenu10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(menu1.this, laundry3.class));
                finish();
            }
        });
        btnmenu11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(menu1.this, laundry4.class));
                finish();
            }
        });
        btnmenu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(menu1.this, laundry5.class));
                finish();
            }
        });
        btnmenu6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(menu1.this, laundry6.class));
                finish();
            }
        });
        btnmenu7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(menu1.this, laundry7.class));
                finish();
            }
        });
    }
}