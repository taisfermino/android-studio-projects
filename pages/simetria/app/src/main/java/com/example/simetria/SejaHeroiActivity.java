package com.example.simetria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SejaHeroiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seja_heroi);
    }

    public void chamarActivityHome(View view) {

        Intent chamaHome = new Intent(this, MainActivity.class);
        startActivity(chamaHome);
    }

    public void chamarActivityReceba(View view) {

        Intent chamaReceba = new Intent(this, RecebaActivity.class);
        startActivity(chamaReceba);
    }
    public void chamarActivitySobre(View view) {

        Intent chamaSobre = new Intent(this, SobreActivity.class);
        startActivity(chamaSobre);
    }
}