package com.example.simetria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AdoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adote);
    }
    public void chamarActivityHomeee(View view) {

        Intent chamaHomee = new Intent(this, MainActivity.class);
        startActivity(chamaHomee);
    }

    public void chamarActivityRecebaa(View view) {

        Intent chamaReceba = new Intent(this, RecebaActivity.class);
        startActivity(chamaReceba);
    }

    public void chamarActivityFavorite(View view) {

        Intent chamaFavorite = new Intent(this, FavoriteActivity.class);
        startActivity(chamaFavorite);
    }

    public void chamarActivitySobreee(View view) {

        Intent chamaSobre = new Intent(this, FavoriteActivity.class);
        startActivity(chamaSobre);
    }
}
