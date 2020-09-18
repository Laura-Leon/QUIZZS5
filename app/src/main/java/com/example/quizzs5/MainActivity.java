package com.example.quizzs5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener{

    private EditText editNombre;
    private  EditText editIdenti;
    private Button bContinuar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Refe

        editNombre = findViewById(R.id.editNombre);
        editIdenti = findViewById(R.id.editIdenti);
        bContinuar = findViewById(R.id.bContinuar);

        bContinuar.setOnClickListener(this);
       //cargarDatos();

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.bContinuar:
                String nombres =editNombre.getText().toString();
                String ids = editIdenti.getText().toString();

                SharedPreferences preferences = getSharedPreferences("datos", MODE_PRIVATE);

                String nombreI = preferences.getString("numbres","");
                String identiI = preferences.getString("identifi","");

                //String registroActual = preferences.getString("registros","");


            if(nombres.trim().isEmpty()){
                Toast.makeText(this,"escribe un nombre",Toast.LENGTH_SHORT).show();
                return;
            }
            if(ids.trim().isEmpty()){
                    Toast.makeText(this,"escribe una identificación",Toast.LENGTH_SHORT).show();
                return;
            }

            if(identiI.contains(ids)){
                    Toast.makeText(this, "Usuario ya registrado", Toast.LENGTH_SHORT).show();

                }else {
                    String name = nombreI+":"+nombres;
                    String identif = identiI+":"+ids;

                    preferences.edit().putString("numbres",name).apply();
                    preferences.edit().putString("identifi",identif).apply();

                    Intent i = new Intent( this,NexoActivity.class);
                    bContinuar.setBackgroundColor(Color.rgb(240,24,86));
                    startActivity(i);


                }
                        break;
        }
    }
    }
