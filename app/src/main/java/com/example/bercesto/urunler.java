package com.example.bercesto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class urunler extends AppCompatActivity {

    ImageView imageView;
    ConstraintLayout constrainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_urunler);



        constrainLayout = findViewById(R.id.constraintLayout4);
        Intent urundetay1= new Intent(getApplicationContext(), urun.class);
        constrainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(urundetay1);
            }

        });
        constrainLayout = findViewById(R.id.constraintLayout2);
        Intent urundetay2= new Intent(getApplicationContext(), urun.class);
        constrainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(urundetay2);
            }

        });
        constrainLayout = findViewById(R.id.constraintLayout3);
        Intent urundetay3= new Intent(getApplicationContext(), urun.class);
        constrainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(urundetay3);
            }

        });
        constrainLayout = findViewById(R.id.constraintLayout);
        Intent urundetay4= new Intent(getApplicationContext(), urun.class);
        constrainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(urundetay4);
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