package com.example.nutri;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Magros extends AppCompatActivity {


    private RecyclerView.ViewHolder mViewHolder;

    public Magros() {

        mViewHolder = new RecyclerView.ViewHolder();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magros);

        this.mViewHolder.edit_PCm = findViewById(R.id.edit_PCm);
        this.mViewHolder.edit_SCm = findViewById(R.id.edit_SCm);
        this.mViewHolder.edit_EMm = findViewById(R.id.edit_EMm);
        this.mViewHolder.text_NEMm = findViewById(R.id.text_NEMm);
        this.mViewHolder.text_Quantidadem = findViewById(R.id.text_Quantidadem);
        this.mViewHolder.buton_CalcularM = findViewById(R.id.button_CalcularM);
        this.mViewHolder.button_Voltar = findViewById(R.id.button_Voltar);


        EditText PC = findViewById(R.id.PC);
        PC.getText();

        EditText EM = findViewById(R.id.EM);
        Editable text = EM.getText();

        EditText score = findViewById(R.id.SC);
        score.getText();


        private static class ViewHolder {
            EditText edit_PCm;
            EditText edit_SCm;
            EditText edit_EMm;
            Button button_CalcularM;
            Button Button_Voltar;
            TextView text_NEMm;
            TextView text_Quantidadem;

        }


        if this.mViewHolder.edit_SCm <= 2:
        float PM = 1.2 * PC;
        double expoente = 0.75;
        double PCe = Math.pow(PM, expoente);
        float NEM = 130 * PCe;
            else:
        float PM = 1.15 * PC;
        double expoente = 0.75;
        double PCe = Math.pow(PM, expoente);
        float NEM = 130 * PCe;

        float Quantidade = NEM / EM;


    }

    public void Calcular(View view) {
    }




    public void Voltarm(View view) {
        Intent Voltarm = new Intent(this, .MainActivity.class);
        startActivity(Voltarm);
    }
}
}
