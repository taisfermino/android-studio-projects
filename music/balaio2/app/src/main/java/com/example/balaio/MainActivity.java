package com.example.balaio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void chamarActivityIndex(View view) {

        Intent chamaIndex = new Intent(this, LoginActivity.class);
        startActivity(chamaIndex);
    }

    public void chamarActivityCadastro(View view) {

        Intent chamaAdote = new Intent(this, CadastroActivity.class);
        startActivity(chamaAdote);
    }


}