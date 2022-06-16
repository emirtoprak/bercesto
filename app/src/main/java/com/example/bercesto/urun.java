package com.example.bercesto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class urun extends AppCompatActivity {

    ImageView imageView;

    private String[] bedenler={"XS","S","M","L","XL"};

    private Spinner spinner2;
    private ArrayAdapter<String> dataAdapterForBeden;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_urun);

        spinner2 =(Spinner) findViewById(R.id.spinner2);
        dataAdapterForBeden= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,bedenler);
        dataAdapterForBeden.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner2.setAdapter(dataAdapterForBeden);

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