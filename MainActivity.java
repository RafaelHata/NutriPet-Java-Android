package com.example.nutri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Gestantes(View view) {
        Intent Gestantes = new Intent(this, Gestantes.class;);
        startActivity(Gestantes);
    }

    public void Castrados(View view) {
        Intent Castrados = new Intent(this, Castrados.class;);
        startActivity(Castrados);
    }

    public void Lactantes(View view) {
        Intent Lactantes = new Intent(this,.Lactantes;);
        startActivity(Lactantes);
    }

    public void Inteiros(View view) {
        Intent Inteiros = new Intent(this,.Inteiros;);
        startActivity(Inteiros);

    }

    public void Obesos(View view) {
        Intent Obesos = new Intent(this,.Obesos;);
        startActivity(Obesos);
    }

    public void Magros(View view) {
        Intent Magros = new Intent(this,.Magros;);
        startActivity(Magros);
    }
}