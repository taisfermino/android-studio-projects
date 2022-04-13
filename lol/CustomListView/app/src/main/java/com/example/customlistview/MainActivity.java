package com.example.customlistview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Montando a ListView
    ListView listView;

    //vetor de tipo String que armazena as caracteristicas dos personagens
    String sobre[] = {"Função:Tanque Dificuldade:Baixa", "Função:Tanque Dificuldade:Moderado", "Função:Atirador Dificuldade:Baixa", "Função:Assassino Dificuldade:Alta", "Função:Atirador Dificuldade:Moderado", "Função:Assassino Dificuldade:Alta", "Função:Suporte Dificuldade:Baixa", "Função:Mago          Dificuldade:Alta", "Função:Lutador Dificuldade:Baixa", "Função:Suporte Dificuldade:Moderado"};

    //vetor de tipo String que armazena o nome dos personagens
    String nome[] = {"Amumu", "Leona", "Miss Fortune", "Nidalle", "Senna", "Shaco", "Soraka", "Syndra", "Volibear", "Zilean"};

    //vetor de tipo String que armazena o codnome dos personagens
    String codnome[] = {" A MUMIA TRISTE ", " A ALVORADA RADIANTE ", " A CAÇADORA DE RECOMPENSAS ", " A CAÇADORA BESTIAL ", " A REDENTORA", " O BUFÃO DEMONÍACO ", " A FILHA DAS ESTRELAS ", " A SOBERANA SOMBRIA ", " A TEMPESTADE IMPLACÁVEL", "O GUARDIÃO DO TEMPO"};

   //vetor do tipo Int que armazena as imagens que estão na pasta DRAWABLE do AndroidStudio (R.drawable.NOMEDAIMAGEM) / imagens da ListView
    int images[] = {R.drawable.amamu, R.drawable.leona, R.drawable.misfortune, R.drawable.nidalee, R.drawable.senna, R.drawable.shaco, R.drawable.soraka, R.drawable.syndra, R.drawable.volibear, R.drawable.zilean};

    //vetor do tipo Int que armazena as imagens que estão na pasta DRAWABLE do AndroidStudio (R.drawable.NOMEDAIMAGEM) / imagens da segunda tela
    int segundatela[] = {R.drawable.amumuse, R.drawable.leonase, R.drawable.missortunese, R.drawable.nidaleese, R.drawable.sennase, R.drawable.shacose, R.drawable.sorakase, R.drawable.syndrase, R.drawable.volibearse, R.drawable.zileanse};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        //adaptando objetos na listView
        MyAdapter adapter = new MyAdapter(this, nome, codnome, images);
        listView.setAdapter(adapter);

        //quando o usuario clicar em algum personagem da lista vai abrir uma nova class com as seguintes caracteristicas:
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            //pegando a posição da listView
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //comparando a posição da listView / tdo vetor começa do 0
                if (position == 0) {
                    //mensagem quando clica
                    Toast.makeText(MainActivity.this,"Mais informações sobre Amumu", Toast.LENGTH_SHORT).show();
                    //exibindo uma "nova tela"/atividade
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    //enviando itens p outra atividade
                    Bundle bundle = new Bundle();
                    //chamando itens
                    bundle.putInt("image", segundatela[0]);
                    intent.putExtras(bundle);
                    // apresentando nome do personagem na nova atividade
                    intent.putExtra("title", nome[0]);
                    intent.putExtra("description",  codnome[0]);
                    intent.putExtra("description", sobre[0]);
                    // posição
                    intent.putExtra("position", "" + 0);
                    startActivity(intent);


                }
                //comparando a posição da listView / tdo vetor começa do 0
                if (position == 1) {
                    //mensagem quando clica
                    Toast.makeText(MainActivity.this,"Mais informações sobre Leona", Toast.LENGTH_SHORT).show();
                    //exibindo uma "nova tela"/atividade
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    //enviando itens p outra atividade
                    Bundle bundle = new Bundle();
                    //chamando itens
                    bundle.putInt("image", segundatela[1]);
                    intent.putExtras(bundle);
                    // apresentando nome do personagem na nova atividade
                    intent.putExtra("title", nome[1]);
                    intent.putExtra("description",  codnome[1]);
                    intent.putExtra("description", sobre[1]);
                    // posição
                    intent.putExtra("position", "" + 1);
                    startActivity(intent);


                }
                //comparando a posição da listView / tdo vetor começa do 0
                if (position == 2) {
                    //mensagem quando clica
                    Toast.makeText(MainActivity.this,"Mais informações sobre Miss Fortune", Toast.LENGTH_SHORT).show();
                    //exibindo uma "nova tela"/atividade
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    //enviando itens p outra atividade
                    Bundle bundle = new Bundle();
                    //chamando itens
                    bundle.putInt("image", segundatela[2]);
                    intent.putExtras(bundle);
                    // apresentando nome do personagem na nova atividade
                    intent.putExtra("title", nome[2]);
                    intent.putExtra("description",  codnome[2]);
                    intent.putExtra("description", sobre[2]);
                    // posição
                    intent.putExtra("position", "" + 2);
                    startActivity(intent);


                }
                //comparando a posição da listView / tdo vetor começa do 0
                if (position == 3) {
                    //mensagem quando clica
                    Toast.makeText(MainActivity.this,"Mais informações sobre Nidalle", Toast.LENGTH_SHORT).show();
                    //exibindo uma "nova tela"/atividade
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    //enviando itens p outra atividade
                    Bundle bundle = new Bundle();
                    //chamando itens
                    bundle.putInt("image", segundatela[3]);
                    intent.putExtras(bundle);
                    // apresentando nome do personagem na nova atividade
                    intent.putExtra("title", nome[3]);
                    intent.putExtra("description",  codnome[3]);
                    intent.putExtra("description", sobre[3]);
                    // posição
                    intent.putExtra("position", "" + 3);
                    startActivity(intent);


                }
                //comparando a posição da listView / tdo vetor começa do 0
                if (position == 4) {
                    //mensagem quando clica
                    Toast.makeText(MainActivity.this,"Mais informações sobre Senna", Toast.LENGTH_SHORT).show();
                    //exibindo uma "nova tela"/atividade
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    //enviando itens p outra atividade
                    Bundle bundle = new Bundle();
                    //chamando itens
                    bundle.putInt("image", segundatela[4]);
                    intent.putExtras(bundle);
                    // apresentando nome do personagem na nova atividade
                    intent.putExtra("title", nome[4]);
                    intent.putExtra("description",  codnome[4]);
                    intent.putExtra("description", sobre[4]);
                    // posição
                    intent.putExtra("position", "" + 4);
                    startActivity(intent);


                }
                //comparando a posição da listView / tdo vetor começa do 0
                if (position == 5) {
                    //mensagem quando clica
                    Toast.makeText(MainActivity.this,"Mais informações sobre Shaco", Toast.LENGTH_SHORT).show();
                    //exibindo uma "nova tela"/atividade
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    //enviando itens p outra atividade
                    Bundle bundle = new Bundle();
                    //chamando itens
                    bundle.putInt("image", segundatela[5]);
                    intent.putExtras(bundle);
                    // apresentando nome do personagem na nova atividade
                    intent.putExtra("title", nome[5]);
                    intent.putExtra("description",  codnome[5]);
                    intent.putExtra("description", sobre[0]);
                    // posição
                    intent.putExtra("position", "" + 5);
                    startActivity(intent);


                }
                //comparando a posição da listView / tdo vetor começa do 0
                if (position == 6) {
                    //mensagem quando clica
                    Toast.makeText(MainActivity.this,"Mais informações sobre Soraka", Toast.LENGTH_SHORT).show();
                    //exibindo uma "nova tela"/atividade
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    //enviando itens p outra atividade
                    Bundle bundle = new Bundle();
                    //chamando itens
                    bundle.putInt("image", segundatela[6]);
                    intent.putExtras(bundle);
                    // apresentando nome do personagem na nova atividade
                    intent.putExtra("title", nome[6]);
                    intent.putExtra("description",  codnome[6]);
                    intent.putExtra("description", sobre[6]);
                    // posição
                    intent.putExtra("position", "" + 6);
                    startActivity(intent);


                }
                //comparando a posição da listView / tdo vetor começa do 0
                if (position == 7) {
                    //mensagem quando clica
                    Toast.makeText(MainActivity.this,"Mais informações sobre Syndra", Toast.LENGTH_SHORT).show();
                    //exibindo uma "nova tela"/atividade
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    //enviando itens p outra atividade
                    Bundle bundle = new Bundle();
                    //chamando itens
                    bundle.putInt("image", segundatela[7]);
                    intent.putExtras(bundle);
                    // apresentando nome do personagem na nova atividade
                    intent.putExtra("title", nome[7]);
                    intent.putExtra("description",  codnome[7]);
                    intent.putExtra("description", sobre[7]);
                    // posição
                    intent.putExtra("position", "" + 7);
                    startActivity(intent);


                }
                //comparando a posição da listView / tdo vetor começa do 0
                if (position == 8) {
                    //mensagem quando clica
                    Toast.makeText(MainActivity.this,"Mais informações sobre Volibear", Toast.LENGTH_SHORT).show();
                    //exibindo uma "nova tela"/atividade
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    //enviando itens p outra atividade
                    Bundle bundle = new Bundle();
                    //chamando itens
                    bundle.putInt("image", segundatela[8]);
                    intent.putExtras(bundle);
                    // apresentando nome do personagem na nova atividade
                    intent.putExtra("title", nome[8]);
                    intent.putExtra("description",  codnome[8]);
                    intent.putExtra("description", sobre[8]);
                    // posição
                    intent.putExtra("position", "" + 8);
                    startActivity(intent);


                }
                //comparando a posição da listView / tdo vetor começa do 0
                if (position == 9) {
                    //mensagem quando clica
                    Toast.makeText(MainActivity.this,"Mais informações sobre Zilean", Toast.LENGTH_SHORT).show();
                    //exibindo uma "nova tela"/atividade
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    //enviando itens p outra atividade
                    Bundle bundle = new Bundle();
                    //chamando itens
                    bundle.putInt("image", segundatela[9]);
                    intent.putExtras(bundle);
                    // apresentando nome do personagem na nova atividade
                    intent.putExtra("title", nome[9]);
                    intent.putExtra("description",  codnome[9]);
                    intent.putExtra("description", sobre[9]);
                    // posição
                    intent.putExtra("position", "" + 9);
                    startActivity(intent);


                }

            }
        });
    }

    // converte um ArrayList dos objetos em Viewitens carregados no ListViewcontêiner.
    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String rTitle[];
        String rDescription[];
        int rImages[];

        //definindo adaptador
        MyAdapter(Context c, String title[], String description[], int imgs[]) {
            super(c, R.layout.row, R.id.textView1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImages = imgs;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View row = layoutInflater.inflate(R.layout.row, parent, false);

            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textView1);
            TextView myDescription = row.findViewById(R.id.textView2);

            images.setImageResource(rImages[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);

            return row;
        }
    }
}
