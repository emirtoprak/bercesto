package com.example.bercesto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class kayitol extends AppCompatActivity {

    private EditText editTextAdSoyad,editTextParola,editTextEmail,editTextParolaTekrar,editTextPhone,editTextDate;
    private String txtAdSoyad,txtParola,txtEmail,txtParolaTekrar,txtPhone,txtDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kayitol);



        editTextAdSoyad=(EditText) findViewById(R.id.editTextAdSoyad);
        editTextEmail=(EditText) findViewById(R.id.editTextEmail);
        editTextParola=(EditText) findViewById(R.id.editTextParola);
        editTextParolaTekrar=(EditText) findViewById(R.id.editTextParolaTekrar);
        editTextPhone=(EditText) findViewById(R.id.editTextPhone);
        editTextDate=(EditText) findViewById(R.id.editTextDate);
    }

    public void  kayitOl(View v){
        txtAdSoyad=editTextAdSoyad.getText().toString();
        txtEmail=editTextEmail.getText().toString();
        txtParola=editTextParola.getText().toString();
        txtParolaTekrar=editTextParolaTekrar.getText().toString();
        txtPhone=editTextPhone.getText().toString();
        txtDate=editTextDate.getText().toString();

        if(!TextUtils.isEmpty(txtAdSoyad) && !TextUtils.isEmpty(txtEmail) && !TextUtils.isEmpty(txtParola) && !TextUtils.isEmpty(txtParolaTekrar) && !TextUtils.isEmpty(txtPhone) && !TextUtils.isEmpty(txtDate)){

        }else
            Toast.makeText(this,"Boş olan yerleri doldurunuz.",Toast.LENGTH_SHORT).show();

        if (!TextUtils.equals(txtParola,txtParolaTekrar)){

        }else
            Toast.makeText(this,"Parolalar birbirleri ile uyuşmuyor!",Toast.LENGTH_SHORT).show();
    }
}