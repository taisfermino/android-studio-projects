package com.example.balaio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void chamarcadActivity (View view){

        Intent chamaTelac = new Intent (this,CadastroActivity.class);
        startActivity(chamaTelac);
    }
    public void chamarActivity (View view){

        Intent chamaTela = new Intent (this,MainActivity.class);
        startActivity(chamaTela);
    }
}