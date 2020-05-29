package com.example.nutri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Castrados extends AppCompatActivity {


    private static View PCc = ;
    private static final View EMc = ;
    private static final View NEMc = ;
    private static final View Quantidadec = ;
    private static final View Calcularc = ;
    private static final View Voltarc = ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_castrados);

        PCc = findViewById(R.id.edit_Pesoc);
        EMc = findViewById(R.id.edit_EMc);
        NEMc = findViewById(R.id.text_NEMc);
        Quantidadec = findViewById(R.id.text_Quantidadec);
        Calcularc = findViewById(R.id.button_CalcularC);
        Voltarc = findViewById(R.id.button_Voltar)



    public void Calcular(View view) {
        double expoente = 0.75;
        double PCce = Math.pow(PCc, expoente);
                float NEMc = 95 * PCce;
                float Quantidadec = NEMc / EMc;
                       this.findViewById(R.id.text_NEMc) = float NEMc %2F;
                        this.findViewById(R.id.text_Quantidadec) = float Quantidadec %2F;
        }


}

    public void Voltarc(View view) {
        Intent Voltar = new Intent(this, .MainActivity.class);
        startActivity(Voltar);
    }


}

