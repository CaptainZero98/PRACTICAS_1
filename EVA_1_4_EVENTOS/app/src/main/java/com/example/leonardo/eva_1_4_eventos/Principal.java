package com.example.leonardo.eva_1_4_eventos;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity implements View.OnClickListener {//CREAMOS UN OBJETO DE LISTENER
    TextView txtvwMensa;//este objeto se vincula al widget
    Button btnInterfaz;//Vinculamos botón
    Button btnClaseAnon;//Vinculamos botón
    Button btnClase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    txtvwMensa=(TextView) findViewById(R.id.txtvwMensaje);
    txtvwMensa.setText("Hola mundo cruel");//
        final Context cntApp=getApplicationContext();
    btnInterfaz=(Button) findViewById(R.id.btnInterfaz);
    btnInterfaz.setOnClickListener(this);//ASIGNANMOS EL LISTENER AL BTN INTERFAZ

        btnClaseAnon=(Button) findViewById(R.id.btnClaseAnon);
        btnClaseAnon.setOnClickListener(new View.OnClickListener() {



            @Override //AL SER UNA INTERFAZ NECESITAMOS SOBREESCRIBIR LA DECLARACIÓN
            public void onClick(View v) {

                Toast.makeText(cntApp,"Evento de clase anónima",Toast.LENGTH_LONG).show();//Con este se agregan los textos de la clase anónima

            }
        });
        ClickListener oMiClick=new ClickListener();
        btnClase = findViewById(R.id.btnClase);
        btnClase.setOnClickListener(oMiClick);


    }

    public void miClick(View v){//Es utilizado a la hora de realizar los clicks

        Toast.makeText(this,"No pos saca pack",Toast.LENGTH_LONG).show();

    }

    @Override
    public void onClick(View v) {


        Toast.makeText(this,"Ira men deja te explico",Toast.LENGTH_LONG).show();

    }
}
