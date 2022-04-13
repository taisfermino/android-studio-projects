package com.example.frutas;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.*;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
   Spinner spFrutas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spFrutas = (Spinner) findViewById(R.id.spFrutas);

        //criação de um ArrayAdapter usando um array de String e um layout padrão de spinner
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.frutas, android.R.layout.simple_spinner_item);

        //carregar o spiner com o ArrayAdapter

        spFrutas.setAdapter(adapter);

    }

    public void selecionar (View v){

        TextView lblFruta = (TextView) findViewById(R.id.lblFruit);
        TextView lblPosicao = (TextView) findViewById(R.id.lblPosition);

        //Selecionar item do Spinnner
        String frutaSelec = spFrutas.getSelectedItem().toString();
        lblFruta.setText("Fruta:"+frutaSelec);

        //Selecionar posição do Scanner
        int posicao =spFrutas.getSelectedItemPosition();
        lblPosicao.setText("Posição:"+posicao);
    }
}
