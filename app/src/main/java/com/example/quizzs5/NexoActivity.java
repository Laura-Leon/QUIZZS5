package com.example.quizzs5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.Toast;

public class NexoActivity extends AppCompatActivity implements View.OnClickListener {
    private Button bContinuar2;
    private int contador ;
    CheckBox c1,c2,c3,c4,c5;
    private boolean checkeado;
    private boolean ninguno = false;
    private int opcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nexo);
        bContinuar2 = findViewById(R.id.bContinuar2);
        contador = 0;
        checkeado = false;
        opcion = 0;




        c1 =  findViewById(R.id.c1);
        c2 =  findViewById(R.id.c2);
        c3 =  findViewById(R.id.c3);
        c4 =  findViewById(R.id.c4);
        c5 =  findViewById(R.id.c5);






        //validar();
        bContinuar2.setOnClickListener(this);
        c1.setOnClickListener(this);
        c2.setOnClickListener(this);
        c3.setOnClickListener(this);
        c4.setOnClickListener(this);
        c5.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.bContinuar2:

                //validar();

                    //if (checkeado==true) {
                if(c1.isChecked()==false&&c2.isChecked()==false&&c3.isChecked()==false&&c4.isChecked()==false&&c5.isChecked()==false){
                    Toast.makeText(this,"escoge una opción",Toast.LENGTH_SHORT).show();
                    return;

                }
                        Intent o = new Intent(this, SintomasActivity.class);
                        o.putExtra("contador11",contador);

                        startActivity(o);
                        bContinuar2.setBackgroundColor(Color.rgb(240, 24, 86));
                        Toast.makeText(getApplicationContext(),""+contador,Toast.LENGTH_SHORT).show();


                    break;

            case R.id.c1:
                c1.isChecked();
                if (c1.isChecked()){

                    contador +=3;
                    //sel+= "opción1\n";
                }else {contador -=3;}
                c5.setChecked(false);
                break;
            case R.id.c2:
                c2.isChecked();
                if (c2.isChecked()){

                    contador += 3;
                    //sel+= "opción2\n";
                }else {contador -=3;}
                c5.setChecked(false);
                break;
            case R.id.c3:
                c3.isChecked();

                if (c3.isChecked()){

                    contador += 3;
                    //sel+= "opción3\n";
                }else {contador -=3;}
                c5.setChecked(false);
                break;
            case R.id.c4:

                c4.isChecked();

                if (c4.isChecked()){

                    contador += 3;
                    //sel+= "opción4\n";
                }else {contador -=3;}
                c5.setChecked(false);
                break;

            case R.id.c5:
                c5.isChecked();


                if (c5.isChecked()==true) {

                    contador += 0;
                }
                c1.setChecked(false);
                c2.setChecked(false);
                c3.setChecked(false);
                c4.setChecked(false);
                    //sel+= "opción5\n";
                break;
                }
    }
    /*
      Toast.makeText(getApplicationContext(),sel,Toast.LENGTH_SHORT).show();
     Toast.makeText(getApplicationContext(),""+contador,Toast.LENGTH_SHORT).show();
    }
     */


    }
