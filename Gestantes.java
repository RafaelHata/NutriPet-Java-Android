package com.example.nutri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import static java.lang.Math.*;


public class Gestantes extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gestantes);

        EditText Pesog = findViewById(R.id.edit_Pesog);
        Pesog.getText();
        EditText EMg = findViewById(R.id.edit_EMg);
        EMg.getText();


        public void CalcluarG (View view){
            double expoente = 0.75;
            double PCge = Math.pow(Pesog, expoente)
            double NEMg = 130 * PCge;
            double Quantidadeg = NEMg / EMg;
            this.findViewById(R.id.text_NEMg) = double NEMg %2F;
            this.findViewById(R.id.text_Quantidadeg) = double Quantidadeg %2F;

        }

        public void Voltarg (View view){
            Intent Voltarg = new Intent(this,.MainActivity. class);
            startActivity(Voltarg);
        }
    }
}