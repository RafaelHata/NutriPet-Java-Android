package com.example.nutri;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Lactantes extends AppCompatActivity {

}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lactantes);

        private static class ViewHolder {
            EditText edit_PCl;
            EditText edit_filhotes;
            EditText edit_semana;
            EditText edit_EMl;
            Button button_Calcularl;
            Button Button_Voltar;
            TextView text_NEMl;
            TextView text_Quantidadel;



            public void Calcular(View view) {
    }



    public void Voltarl(View view) {
            Intent Voltarl = new Intent(this, .MainActivity.class);
            startActivity(Voltarl);
    }