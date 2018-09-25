package com.example.leonardo.eva_1_5_otros_eventos;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Principal extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{


    RadioGroup rdgOpciones;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        rdgOpciones=findViewById(R.id.rdgOpciones);//Vinculamos el radiogroup
        rdgOpciones.setOnCheckedChangeListener(this);
    }

    @Override                       //RadioGroup que genera el evento
                                    //int i---Numero de id de los rb
    public void onCheckedChanged(RadioGroup group , int i) {//Metodo que se sobreescribe al implementar el radio group
     String sMensa;

     switch(i){

         case R.id.rbTacos:
             sMensa="Tacos";
             break;

         case R.id.rbTortas:
             sMensa="Tortas";
             break;

         case R.id.rbChile:
             sMensa="Chiles";
             break;

         case R.id.rbMontados:
             sMensa="Montados";
             break;

        default:
            sMensa="Sin comer";
        }

        Toast.makeText(this,sMensa,Toast.LENGTH_LONG).show();
    }
}
