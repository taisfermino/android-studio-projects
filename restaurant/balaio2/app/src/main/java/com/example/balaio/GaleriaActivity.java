package com.example.balaio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GaleriaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeria);
    }
    public void chamaaActivity (View view){

        Intent chamaaTela = new Intent (this,MainActivity.class);
        startActivity(chamaaTela);
    }
}