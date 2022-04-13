package com.example.simetria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FavoriteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);
    }
    public void chamarActivityHomeeee(View view) {

        Intent chamaHomee = new Intent(this, MainActivity.class);
        startActivity(chamaHomee);
    }

    public void chamarActivityAdotee(View view) {

        Intent chamaAdote = new Intent(this, RecebaActivity.class);
        startActivity(chamaAdote);
    }
    public void chamarActivitySobreeee(View view) {

        Intent chamaSobre = new Intent(this, SobreActivity.class);
        startActivity(chamaSobre);
    }
}
