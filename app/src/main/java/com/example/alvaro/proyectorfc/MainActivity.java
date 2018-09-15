package com.example.alvaro.proyectorfc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void GenerarRFC(View v){
        //Tomar la primer letra y primer vocal del apellido paterno
        EditText apPaterno = (EditText) findViewById(R.id.apPaterno);
        char primerLetraAP = apPaterno.getText().charAT(0);

        char[] vocales = {'A','E','I','O','U'};
                String cadAux = "Pedro Perez";
                char primerLetra= cadAux.charArt(0);


        //Tomar la primer letra del apellido materno


        //Tomar la primer letra del primer nombre


        //Tomar los ultimos 2 digitos del año de nacimiento


        //Tomar los dos digitos del mes de nacimiento


        //Tomar los dos digitos del dia de nacimiento


        //Generar 3 caracteres aleatorios(letras o numeros)


        //Concatenar lo anterior y mostrar el RFC

    }
}
