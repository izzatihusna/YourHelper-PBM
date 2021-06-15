package com.example.helpermu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Doorsmeer1 extends AppCompatActivity {
    //langkah 1
    //sesuaikan dengan tag xml
    Button btnback, btnhubungi, btnbackdoorsmeer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doorsmeer1);

        //langkah 2
        //inisialisasi button dari xml gabungkan
        btnback = (Button) findViewById(R.id.btnback);
        btnhubungi = (Button) findViewById(R.id.btnhubungi);
        btnbackdoorsmeer = (Button) findViewById(R.id.btnbackdoorsmeer);

        //langkah 3
        //memanggil id dari xml button kembali
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //inten berpindah dari aktivity doorsmeer1 menuju ke menu
                startActivity(new Intent(Doorsmeer1.this, menu2.class));
                finish();
            }
        });
        btnhubungi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Doorsmeer1.this, kontakdoorsmeer1.class));
                finish();
            }
        });
        btnbackdoorsmeer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Doorsmeer1.this, menu2.class));
                finish();
            }
        });



    }
}