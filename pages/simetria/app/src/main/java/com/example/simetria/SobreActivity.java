package com.example.simetria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SobreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);

    }
    public void chamarActivityHomeeeee(View view) {

        Intent chamaHomee = new Intent(this, MainActivity.class);
        startActivity(chamaHomee);
    }

}
