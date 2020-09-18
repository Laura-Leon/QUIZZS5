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
import android.widget.Toast;

public class SintomasActivity extends AppCompatActivity implements View.OnClickListener {
    private Button bFinalizar2;
    CheckBox cc1, cc2, cc3, cc4, cc5, cc6, cc7;
     private int contador2 = 0;

    private int conta1;
    private String pruebaSuma;
    private  String todos;
    private  String sumsum;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sintomas);



        bFinalizar2 = findViewById(R.id.bFinalizar2);

         conta1 = getIntent().getExtras().getInt("contador11");



        cc1 = findViewById(R.id.cc1);
        cc2 = findViewById(R.id.cc2);
        cc3 = findViewById(R.id.cc3);
        cc4 = findViewById(R.id.cc4);
        cc5 = findViewById(R.id.cc5);
        cc6 = findViewById(R.id.cc6);
        cc7 = findViewById(R.id.cc7);

        bFinalizar2.setOnClickListener(this);
        cc1.setOnClickListener(this);
        cc2.setOnClickListener(this);
        cc3.setOnClickListener(this);
        cc4.setOnClickListener(this);
        cc5.setOnClickListener(this);
        cc6.setOnClickListener(this);
        cc7.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.bFinalizar2:

                if(cc1.isChecked()==false&&cc2.isChecked()==false&&cc3.isChecked()==false&&cc4.isChecked()==false&&cc5.isChecked()==false&&cc6.isChecked()==false&&cc7.isChecked()==false) {
                    Toast.makeText(this, "escoge una opción", Toast.LENGTH_SHORT).show();
                    return;

                }


               // pruebaSuma  =sumsum.getText().toString();
                SharedPreferences prefer = getSharedPreferences("encuesta2",MODE_PRIVATE);

                pruebaSuma = prefer.getString("sumita","");
                sumsum =""+conta1;
                todos = pruebaSuma + ":" + sumsum;
                prefer.edit().putString("sumita",todos).apply();

                    Intent y = new Intent(this, EncuestaActivity.class);

                    startActivity(y);
                    bFinalizar2.setBackgroundColor(Color.rgb(240, 24, 86));
                    finish();


                break;

            case R.id.cc1:
                cc1.isChecked();
                if (cc1.isChecked()){

                    conta1 +=3;
                    //sel+= "opción1\n";
                }
                cc7.setChecked(false);
                break;
            case R.id.cc2:
                cc2.isChecked();
                if (cc2.isChecked()){

                    conta1 += 3;
                    //sel+= "opción2\n";
                }
                cc5.setChecked(false);
                break;
            case R.id.cc3:
                cc3.isChecked();

                if (cc3.isChecked()){

                    conta1 += 3;
                    //sel+= "opción3\n";
                }
                cc5.setChecked(false);
                break;
            case R.id.cc4:

                cc4.isChecked();

                if (cc4.isChecked()){

                    conta1 += 3;
                    //sel+= "opción4\n";
                }
                cc5.setChecked(false);
                break;
            case R.id.cc5:

                cc5.isChecked();

                if (cc5.isChecked()){

                    conta1 += 3;
                    //sel+= "opción4\n";
                }
                cc7.setChecked(false);
                break;
            case R.id.cc6:

                cc6.isChecked();

                if (cc6.isChecked()){

                    conta1 += 3;
                    //sel+= "opción4\n";
                }
                cc7.setChecked(false);
                break;

            case R.id.cc7:
                cc7.isChecked();

                if (cc7.isChecked()==true) {

                    conta1 += 0;
                }
                cc1.setChecked(false);
                cc2.setChecked(false);
                cc3.setChecked(false);
                cc4.setChecked(false);
                cc5.setChecked(false);
                cc6.setChecked(false);
                //sel+= "opción5\n";
                break;
        }
        }
/*
    public void validarS() {
        String selS = "seleccionado:\n";
        if (cc1.isChecked()) {
            checkeado2 = true;
            conta1 = conta1 + 4;
            selS += "opción1\n";
        }
        if (cc2.isChecked()) {
            checkeado2 = true;
            conta1 = conta1 + 4;
            selS += "opción2\n";
        }
        if (cc3.isChecked()) {
            checkeado2 = true;
            conta1 = conta1 + 4;
            selS += "opción3\n";
        }
        if (cc4.isChecked()) {
            checkeado2 = true;
            conta1 = conta1 + 4;
            selS += "opción4\n";
        }
        if (cc5.isChecked()) {
            checkeado2 = true;
            conta1 = conta1 + 4;
            selS += "opción5\n";
        }
        if (cc6.isChecked()) {
            checkeado2 = true;
            conta1 = conta1 + 4;
            selS += "opción6\n";
        }
        if (cc7.isChecked()==true) {
            cc1.setChecked(false);
            cc2.setChecked(false);
            cc3.setChecked(false);
            cc4.setChecked(false);
            cc5.setChecked(false);
            cc6.setChecked(false);
            ninguno2 = true;

            checkeado2 = false;
            conta1 = conta1 + 0;
            selS += "opción7\n";
        }
        /*
 */

       // Toast.makeText(getApplicationContext(), selS, Toast.LENGTH_SHORT).show();
        //Toast.makeText(getApplicationContext(),""+conta1,Toast.LENGTH_SHORT).show();



}