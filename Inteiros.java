package com.example.nutri;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Inteiros extends AppCompatActivity {


    private RecyclerView.ViewHolder mViewHolder;
    private View PCi;
    private View EMi;
    private View NEMi;
    private View Quantidadei;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inteiros);

        PCi = findViewById(R.id.edit_Pesoi);
        EMi = findViewById(R.id.edit_EMi);
        NEMi = findViewById(R.id.text_NEMi);
        Quantidadei = findViewById(R.id.text_Quantidadei);


        }

    public void Voltari(View view) {
        Intent Voltari = new Intent(this, .MainActivity.class);
        startActivity(Voltari);
    }

    public void Calculari(View view) {
        double expoente = 0.75;
        double PCie;
        PCie = Math.pow(float PCi, float expoente);
        float NEMi = (float) (130 * PCie);
        float Quantidadei = NEMi / EMi;
        this.findViewById(R.id.text_NEMi) =float NEMi %2F;
        this.findViewById(R.id.text_Quantidadei) = float Quantidadei %2F;
    }
}
