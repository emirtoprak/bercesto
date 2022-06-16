package com.example.bercesto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class sepet extends AppCompatActivity {

    ImageView imageView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sepet);

        imageView = findViewById(R.id.HesabımButton);
        Intent eee= new Intent(getApplicationContext(), hesabim.class);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(eee);
            }

        });
        imageView = findViewById(R.id.AnaSayfaButton);
        Intent qqq= new Intent(getApplicationContext(), anasayfa.class);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(qqq);
            }

        });
        imageView = findViewById(R.id.SepetButton);
        Intent wwww= new Intent(getApplicationContext(), sepet.class);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(wwww);
            }

        });

        button = findViewById(R.id.buttonAlisverisDevam);
        Intent rrr= new Intent(getApplicationContext(), anasayfa.class);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(rrr);
            }

        });
    }
}