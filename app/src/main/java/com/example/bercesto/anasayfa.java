package com.example.bercesto;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class anasayfa extends AppCompatActivity {
    Button  button;
    ImageView imageView;
    EditText editText;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anasayfa);

        editText = findViewById(R.id.OverSizeButton);
        Intent intent= new Intent(getApplicationContext(), urunler.class);
        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }

        });
        editText = findViewById(R.id.PoloYakaButton);
        Intent poloıntent= new Intent(getApplicationContext(), urunler.class);
        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(poloıntent);
            }

        });
        editText = findViewById(R.id.SortButton);
        Intent sortintent= new Intent(getApplicationContext(), urunler.class);
        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(sortintent);
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