package com.example.leonardo.eva_1_6_listas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Principal extends AppCompatActivity implements ListView.OnItemClickListener{
    TextView txtvwMostrar;
    ListView lstvwMostrar;
    final String[] sResta={"Charles","Chillis","Hamburguesas el perro","Tripas de gato","Agarramel burros","Barbacoa aquí te la saco","Costilla no quiero","Tortas Piolen","Tortas ratón","El cabañón del resfriado"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        txtvwMostrar=findViewById(R.id.txtvwMostrar);
        lstvwMostrar=findViewById(R.id.lstvwMostrar);
        //NECESITAMOS ASIGNAR UN ADAPTADOR
        //INTERMEDIARIO PARA EL ORIGEN DE DATOS
            lstvwMostrar.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,sResta));

    lstvwMostrar.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
        txtvwMostrar.setText(sResta[i]);
    }
}
