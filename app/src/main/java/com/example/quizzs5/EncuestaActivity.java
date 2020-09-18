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
    private int todito;

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
        SharedPreferences prefer = getSharedPreferences("encuesta2", Context.MODE_PRIVATE);
        String suumita = preferences.getString("sumita","");

        String noombres = preferences.getString("numbres","");
       // String idss = preferences.getString("identifi","");

        String[] nombres =noombres.split(":");
      String[] puntaje =suumita.split(":");


        textNombre.setText("");
        for (int i = 0; i<nombres.length; i++) {


           // textNombre.append(partes[todito] + ":" +puntaje[i]+ "\n");
            textNombre.append(nombres[i] + ":" +"puntaje[i]"+ "\n");

            }

    }


}