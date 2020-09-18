package com.example.quizzs5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EncuestaActivity extends AppCompatActivity implements View.OnClickListener {
    private Button bRegistrar;
    private TextView textNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);
        bRegistrar = findViewById(R.id.bRegistrar);
        textNombre = findViewById(R.id.textNombre);
        bRegistrar.setOnClickListener(this);
    }
    protected void onResume(){
        super.onResume();
        cargarDatos();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bRegistrar:
                bRegistrar.setBackgroundColor(Color.rgb(240,24,86));

                Intent p = new Intent(this,MainActivity.class);
                startActivity(p);
        }
    }
    private void cargarDatos() {
        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
        String noombres = preferences.getString("numbres","");
        String idss = preferences.getString("identifi","");
        //String registros = preferences.getString("registros","");
        String[] partes =noombres.split(":");


        textNombre.setText("");
        for (int i = 0; i<partes.length; i++) {

            textNombre.append(partes[i] + ":" +"aqui deberian ir numeros"+ "\n");

            }

    }


}