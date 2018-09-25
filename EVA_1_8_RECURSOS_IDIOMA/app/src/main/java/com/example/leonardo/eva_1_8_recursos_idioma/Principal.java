package com.example.leonardo.eva_1_8_recursos_idioma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Principal extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    RadioButton rbEsp,rbEn;
    RadioGroup rgIdiomas;
    TextView tvNombre;
    EditText etNombre;
    TextView tvApellido;
    EditText etApellido;
    TextView tvEdad;
    EditText etEdad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

   rgIdiomas=findViewById(R.id.rgIdiomas);
   rgIdiomas.setOnCheckedChangeListener(this);
   tvNombre=findViewById(R.id.tvNombre);
   etNombre=findViewById(R.id.etNombre);
   tvApellido=findViewById(R.id.tvApe);
   etApellido=findViewById(R.id.etApe);
   tvEdad=findViewById(R.id.tvEdad);
   etEdad=findViewById(R.id.etEdad);
   rbEsp=findViewById(R.id.rbEspañol);
   rbEn=findViewById(R.id.rbIngles);
    }


    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {

        if (i==R.id.rbEspañol){
            rbEsp.setText(R.string.rd_espa_es);
            rbEn.setText(R.string.rd_ingles_es);
            tvNombre.setText(R.string.tv_nombre_es);
            etNombre.setHint(R.string.et_nombre_es);
            tvApellido.setText(R.string.tv_apellido_es);
            etApellido.setHint(R.string.et_apellido_es);
            tvEdad.setText(R.string.tv_edad_es);
            etEdad.setHint(R.string.et_edad_es);
        }else{
            rbEsp.setText(R.string.rd_espa_en);
            rbEn.setText(R.string.rd_ingles_en);
            tvNombre.setText(R.string.tv_nombre_en);
            etNombre.setHint(R.string.et_nombre_en);
            tvApellido.setText(R.string.tv_apellido_en);
            etApellido.setHint(R.string.et_apellido_en);
            tvEdad.setText(R.string.tv_edad_en);
            etEdad.setHint(R.string.et_edad_en);

        }

    }
}
