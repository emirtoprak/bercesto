package com.example.bercesto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class girisyap extends AppCompatActivity {
      Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_girisyap);

        button = findViewById(R.id.girisYapButton);
        Intent gırısıntent= new Intent(getApplicationContext(), anasayfa.class);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(gırısıntent);
            }

        });
        button = findViewById(R.id.kayitOlButton);
        Intent kayıtintent= new Intent(getApplicationContext(),kayitol.class);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(kayıtintent);
            }

        });
    }
}