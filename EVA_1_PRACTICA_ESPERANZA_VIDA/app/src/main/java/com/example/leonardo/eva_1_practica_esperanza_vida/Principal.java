package com.example.leonardo.eva_1_practica_esperanza_vida;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    RadioButton rbMujer, rbHombre, rbDesa, rbAsia, rbAmerica, rbAfrica;
    RadioGroup rgGenero, rgRegion;
    EditText etAnio;
    TextView tvDeceso, tvExpect;
    int iDeceso = 0;
    int iAnio = 0;
    int iEsperanza = 0;
    int iAsia, iDesarrollados, iAmerica, iAfrica, iDif;
    int iSeleccionado,iSelecGene;
    String sFecha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        rbMujer = findViewById(R.id.rbMujer);
        rbHombre = findViewById(R.id.rbHombre);
        rbDesa = findViewById(R.id.rbDesa);
        rbAsia = findViewById(R.id.rbAsia);
        rbAmerica = findViewById(R.id.rbAmerica);
        rbAfrica = findViewById(R.id.rbAfrica);
        rgGenero = findViewById(R.id.rgGenero);
        rgGenero.setOnCheckedChangeListener(this);
        rgRegion = findViewById(R.id.rgRegion);
        rgRegion.setOnCheckedChangeListener(this);
        etAnio = findViewById(R.id.etAnio);

        tvDeceso = findViewById(R.id.tvDeceso);
        tvExpect = findViewById(R.id.tvExpect);


    }


    @Override
    public void onCheckedChanged(RadioGroup group, int i) {
        sFecha = etAnio.getText().toString();
        iAnio = Integer.parseInt(sFecha);


        if (iAnio <= 1960 && iAnio >= 1950) {
            iDesarrollados = 75;
            iAmerica = 60;
            iAsia = 45;
            iAfrica = 35;
            iDif = 10;
            Log.d("David se la come = ", "iDif = " + iDif);

        } else if (iAnio <= 1970 && iAnio >= 1961) {
            iDesarrollados = 75;
            iAmerica = 65;
            iAsia = 50;
            iAfrica = 45;
            iDif = 9;

        } else if (iAnio <= 1980 && iAnio >= 1971) {
            iDesarrollados = 80;
            iAmerica = 70;
            iAsia = 65;
            iAfrica = 55;
            iDif = 8;
        } else if (iAnio <= 1990 && iAnio >= 1981) {
            iDesarrollados = 80;
            iAmerica = 75;
            iAsia = 65;
            iAfrica = 60;
            iDif = 7;
        } else if (iAnio <= 2000 && iAnio >= 1991) {
            iDesarrollados = 85;
            iAmerica = 75;
            iAsia = 60;
            iAfrica = 55;
            iDif = 6;
        } else if (iAnio <= 2010 && iAnio >= 2001) {
            iDesarrollados = 90;
            iAmerica = 70;
            iAsia = 65;
            iAfrica = 60;
            iDif = 4;
        }
        if(i == R.id.rbDesa){
            iSeleccionado = 1;
        }else if(i==R.id.rbAmerica){

            iSeleccionado=2;


            }else if(i==R.id.rbAsia){
            iSeleccionado=3;

        }else if (i==R.id.rbAfrica){

            iSeleccionado=4;

        }

        if(i==R.id.rbMujer){
            iSelecGene=1;

        }else if(i==R.id.rbHombre){
            iSelecGene=2;

        }

        if (iSeleccionado==4) {

            if (iSelecGene==1) {
                iEsperanza = iAfrica + (iDif / 2);
                iDeceso = iAnio + iEsperanza;
            } else if (iSelecGene==2) {
                iEsperanza = iAfrica - (iDif / 2);
                iDeceso = iAnio + iEsperanza;

            }
        } else if (iSeleccionado==2) {

            if (iSelecGene==1) {
                iEsperanza = iAmerica + (iDif / 2);
                iDeceso = iAnio + iEsperanza;
            } else if (iSelecGene==2) {
                iEsperanza = iAmerica - (iDif / 2);
                iDeceso = iAnio + iEsperanza;

            }
        } else if (iSeleccionado==3) {

            if (iSelecGene==1) {
                iEsperanza = iAsia + (iDif / 2);
                iDeceso = iAnio + iEsperanza;
            } else if (iSelecGene==2) {
                iEsperanza = iAsia - (iDif / 2);
                iDeceso = iAnio + iEsperanza;

            }
        } else if (iSeleccionado==1) {
            Log.d("Entra", " Desa");
            if (iSelecGene==1) {
                iEsperanza = iDesarrollados + (iDif / 2);
                Log.d("Entra", " Mujer");
                iDeceso = iAnio + iEsperanza;
            } else if (iSelecGene==2) {
                iEsperanza = iDesarrollados - (iDif / 2);
                iDeceso = iAnio + iEsperanza;
                Log.d("Entra", " Hombre");

            }
        }
        tvExpect.setText(iEsperanza + " ");
        tvDeceso.setText(iDeceso + " ");


    }
}
