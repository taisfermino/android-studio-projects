package com.example.simetria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RecebaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receba);
    }
    public void chamarActivityHomee(View view) {

        Intent chamaHomee = new Intent(this, MainActivity.class);
        startActivity(chamaHomee);
    }

    public void chamarActivitySeja(View view) {

        Intent chamaSeja = new Intent(this, SejaHeroiActivity.class);
        startActivity(chamaSeja);
    }

    public void chamarActivityAdote(View view) {

        Intent chamaAdote = new Intent(this, AdoteActivity.class);
        startActivity(chamaAdote);
    }

    public void chamarActivitySobree(View view) {

        Intent chamaSobre = new Intent(this, SobreActivity.class);
        startActivity(chamaSobre);
    }
}
