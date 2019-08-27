package com.example.cardpio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.cardpio.modelos.Produto;

import java.util.ArrayList;

public class ProdutosActivity extends AppCompatActivity {

    private TextView textView;
    private ArrayList<Produto> produtos = new ArrayList<>();
    private LinearLayout linearLayout;
    private ImageView imageViewProduto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produtos);


        Intent intent = getIntent();
        String titulo = intent.getStringExtra(MainActivity.TITULO);


        textView = findViewById(R.id.text_view_produto);
        textView.setText(titulo);

        linearLayout = findViewById(R.id.layout);
        imageViewProduto = findViewById(R.id.image_view_produto);

        criarProdutos(titulo);
        listarProduto();


    }

    public  void criarProdutos(String titulo){
        if (titulo.equals("Picanha")){
            imageViewProduto.setImageResource(R.drawable.picanha);
            produtos.add(new Produto("Picanha Ao Ponto",
                    50.90,
                    "carne",
                    "Picanha ao Ponto"));
            produtos.add(new Produto("Picanha Queimada",
                    60.00,
                    "carne",
                    "Picanha muito boa queimada"));


        }
        else if(titulo.equals("Dolly")){
            imageViewProduto.setImageResource(R.drawable.doly);
            produtos.add(new Produto("Dolly de uva",
                    5.00,
                    "Refrigerante",
                    "Delicioso Sabor de Uva"));
            produtos.add(new Produto("Dolly de Limão",
                    6.00,
                    "Refrigerante",
                    "Delicioso Refrigerante Sabor de Limão"));

        }
        else  if (titulo.equals("Costelinha")){
            imageViewProduto.setImageResource(R.drawable.costelinha);
            produtos.add(new Produto("Costela de Porco",
                    60.00,
                    "Carne do Poco",
                    "Deliciosa Carne de Porco"));

        }
        else if (titulo.equals("Suco de Maracúja")){
            imageViewProduto.setImageResource(R.drawable.suco);
            produtos.add(new Produto("Suco de Maracúja",
                    4.00,
                    "Suco",
                    "Suco de Maracúja Delicioso"));

        }

    }

    public void listarProduto(){

        for (int i=0; i<produtos.size(); i++){

            TextView textViewNome = new TextView(this);
            TextView textViewPreco = new TextView(this);
            TextView textViewDescricao = new TextView(this);

            textViewNome.setText(produtos.get(i).getNome());
            textViewNome.setTextSize(18);

            textViewPreco.setText("R$ "+produtos.get(i).getPreco().toString().replace(".",","));

            textViewDescricao.setText("Descrição: "+produtos.get(i).getDescricao());
            textViewDescricao.setTextSize(18);

            linearLayout.addView(textViewNome);
            linearLayout.addView(textViewPreco);
            linearLayout.addView(textViewDescricao);

        }
    }
}
