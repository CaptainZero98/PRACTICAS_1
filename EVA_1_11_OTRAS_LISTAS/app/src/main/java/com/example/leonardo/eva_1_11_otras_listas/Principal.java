package com.example.leonardo.eva_1_11_otras_listas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Principal extends AppCompatActivity implements ListView.OnItemClickListener {

    ListView lstvwTitu;
    TextView tvMuestra;
   final String [] sTitulo = {"Hunger Games","Maze Runner","IT","Las aventuras de Leo tu padre","The life of PI","Matilda","La vuelta al mundo en 80 días"};
    final String [] sSinopsis={"Habla de la historia de Katniss, ua chica que se creía especial y lleva a su distrito a la ruina, desatando un golpe de estado en la cual muchos terminan heridos","Thomas, un científico trabajador de una empresa que lucha por erradicar una enfermedad, borra su memoria y ahora es parte de una revolución para cambiar el mundo"
            ,"Un payaso de mas de 100 años aterroriza a los niños en un pequeño pueblo, llega cada 27 años, nadie lo entiende","Un joven estudiante, vive su vida en busca de encontrar lo que podría ser la aventura qur cambie el mundo","Un joven Hindú, amante d elos animales, busca su fé en otras religiones y termina naufragando en una isla paradisiaca en el oceano índico"
            ,"Una joven que no la quiere ni su madre, busca la aprobación teniendo poderes mentales, con lo cual se divierte y toca rolas chidas","Un señor apostador en Londres, habla con sus compañeros de Poker, para hablar sobre un viaje alrededor del mundo"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        lstvwTitu=findViewById(R.id.lstvwTitu);
        tvMuestra=findViewById(R.id.tvMuestra);
        lstvwTitu.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,sTitulo));

    lstvwTitu.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
        tvMuestra.setText(sSinopsis[i]);



    }
}
