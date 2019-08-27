package com.example.cardpio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String TITULO = "com.example.cardpio.TITULO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void abrirDoly(View view){

        Intent intent = new Intent(this, ProdutosActivity.class);
        intent.putExtra(TITULO,"Dolly");
        startActivity(intent);
    }

    public void abrirPicanha(View v){
        Intent intent = new Intent(this, ProdutosActivity.class);
        intent.putExtra(TITULO,"Picanha");
        startActivity(intent);
    }

    public void abrirCostelinha(View v){
        Intent intent = new Intent(this, ProdutosActivity.class);
        intent.putExtra(TITULO,"Costelinha");
        startActivity(intent);
    }

    public void abrirSuco(View v){
        Intent intent = new Intent(this, ProdutosActivity.class);
        intent.putExtra(TITULO,"Suco de Maracúja");
        startActivity(intent);
    }
}
