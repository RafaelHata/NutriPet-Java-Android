package com.example.nutri;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Obesos<ViewHolder> extends AppCompatActivity {

/*

 if Score = 6 or 7
    PM = 0.85 * PC
    double expoente = 0.75;
        double PCe = Math.pow(PM, expoente);
    NEM = 70 * PCe
 else:
    PM = 0.8 * PC
    double expoente = 0.75;
        double PCe = Math.pow(PM, expoente);
    NEM = 70 * PCe

Quantidade = NEM / EM
    private ViewHolder mViewHolder = new ViewHolder()

 */

    private RecyclerView.ViewHolder mViewHolder;

    public Obesos() {
        mViewHolder = new RecyclerView.ViewHolder();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obesos);


        this.mViewHolder.PC = findViewById(R.id.edit_PCo);
        this.mViewHolder.score = findViewById(R.id.edit_SCo);
        this.mViewHolder.EM = findViewById(R.id.edit_EMo);
        this.mViewHolder.NEM = findViewById(R.id.text_NEMo);
        this.mViewHolder.Quantidade = findViewById(R.id.text_Quantidadeo);
        this.mViewHolder.Calcular = findViewById(R.id.button_CalcularO);
        this.mViewHolder.Voltar = findViewById(R.id.button_Voltar);

        private static class ViewHolder {
            EditText edit_PCo;
            EditText edit_SCo;
            EditText edit_EMo;
            Button button_CalcularO;
            Button Button_Voltar;
            TextView text_NEMo;
            TextView text_Quantidadeo;


            public void Voltar(View view) {
                Intent Voltar = new Intent(this, MainActivity.class);
                startActivity(Voltar);
            }


            EditText PC = findViewById(R.id.PC);
        PC.getText();

            EditText EM = findViewById(R.id.EM);
        EM.getText();

            EditText score = findViewById(R.id.SC);
        score.getText();

        if score <=7;
            float PM = 0.85 * PC;
            double expoente = 0.75;
            double PCe = Math.pow(PM, expoente);
            float NEM = 70 * PCe;
                else:
            float PM = 0.8 * PC;
            double expoente = 0.75;
            double PCe = Math.pow(PM, expoente);
            float NEM = 70 * PCe;

            float Quantidade = NEM / EM;


        }

        public void Calcular (View view){
        }


    }



    public void Voltaro(View view) {
        Intent Voltaro = new Intent(this, .MainActivity.class);
        startActivity(Voltaro);
    }
}


