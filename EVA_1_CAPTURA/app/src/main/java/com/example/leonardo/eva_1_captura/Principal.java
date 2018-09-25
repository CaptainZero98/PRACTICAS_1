package com.example.leonardo.eva_1_captura;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class Principal extends AppCompatActivity {

    Button btnAgregar;
    RadioButton rbMujer, rbHombre;
    RadioGroup rgGenero;
    EditText etEdad, etNombre, etApellido, etOrga, etCorreo;
    String sEdad;
    int iEdad;
    String sNombre, sApe, sOrga, sCorreo;
    CapturaDatos cObjeto = new CapturaDatos();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_principal);


        rgGenero = findViewById(R.id.rgGenero);
        rbHombre = findViewById(R.id.rbHombre);
        rbMujer = findViewById(R.id.rbMujer);
        etEdad = findViewById(R.id.etEdad);
        etNombre = findViewById(R.id.etNombre);
        etApellido = findViewById(R.id.etApe);
        etCorreo = findViewById(R.id.etCorreo);
        etOrga = findViewById(R.id.etOrga);
        final Context cntApp = getApplicationContext();
        btnAgregar = findViewById(R.id.btnAgregar);

        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                sEdad = etEdad.getEditableText().toString();
                iEdad = Integer.parseInt(sEdad);
                sNombre = etNombre.getEditableText().toString();
                sApe = etApellido.getEditableText().toString();
                sOrga = etOrga.getEditableText().toString();
                sCorreo = etCorreo.getEditableText().toString();

                new CapturaDatos(iEdad, rgGenero.getTransitionName(), sNombre, sApe, sOrga, sCorreo);

                cObjeto.agregaDatos();


                Toast.makeText(cntApp, "Registros Capturados: " + CapturaDatos.aLista.size(), Toast.LENGTH_LONG).show();

                etCorreo.setText("");
                etOrga.setText("");
                etApellido.setText("");
                etEdad.setText("");
                etNombre.setText("");

            }
        });


    }
}

class CapturaDatos {
    static ArrayList<CapturaDatos> aLista = new ArrayList<CapturaDatos>();

    public CapturaDatos() {
    }

    public CapturaDatos(int iEdad, String sGenero, String sNombre, String sApe, String sOrga, String sCorreo) {
        setsNombre(sNombre);
        setsApe(sApe);
        setsCorreo(sCorreo);
        setsOrga(sOrga);
        setsGenero(sGenero);
        setiEdad(iEdad);


    }

    public void agregaDatos() {


            aLista.add(new CapturaDatos(getiEdad(), getsGenero(), getsNombre(), getsApe(), getsOrga(), getsCorreo()));

    }



    private int iEdad;
    private String sGenero, sNombre, sApe, sOrga, sCorreo;

    public int getiEdad() {
        return iEdad;
    }

    public void setiEdad(int iEdad) {
        this.iEdad = iEdad;
    }

    public String getsGenero() {
        return sGenero;
    }

    public void setsGenero(String sGenero) {
        this.sGenero = sGenero;
    }

    public String getsNombre() {
        return sNombre;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public String getsApe() {
        return sApe;
    }

    public void setsApe(String sApe) {
        this.sApe = sApe;
    }

    public String getsOrga() {
        return sOrga;
    }

    public void setsOrga(String sOrga) {
        this.sOrga = sOrga;
    }

    public String getsCorreo() {
        return sCorreo;
    }

    public void setsCorreo(String sCorreo) {
        this.sCorreo = sCorreo;
    }
}