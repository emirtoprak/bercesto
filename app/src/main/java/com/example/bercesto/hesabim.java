package com.example.bercesto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class hesabim extends AppCompatActivity {
  Button button;
  ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hesabim);
        button = findViewById(R.id.hesapbilgileribtn);
        Intent akayıtıntent= new Intent(getApplicationContext(), hesapdetay.class);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(akayıtıntent);
            }

        });

        button = findViewById(R.id.cikisyapbtn);
        Intent cikis= new Intent(getApplicationContext(), anasayfa.class);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(cikis);
            }

        });
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
    }
}