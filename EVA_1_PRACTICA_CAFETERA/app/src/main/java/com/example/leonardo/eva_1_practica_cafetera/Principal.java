package com.example.leonardo.eva_1_practica_cafetera;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener,CheckBox.OnCheckedChangeListener{

    RadioButton rbAme, rbCapu,rbExp;
    RadioGroup rgCafes;
    CheckBox cbAzu,cbCrema;
    TextView tvDescripcion;
    EditText etCant;
    Button btnTotal;
    int iTotal=0;
    int iCantidades=0;
    int iTotalCafe;
    int iTotalExtras=0;
    String sDesc;
    String sDescExtra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        rbAme=findViewById(R.id.rbAme);
        rbCapu=findViewById(R.id.rbCapu);
        rbExp=findViewById(R.id.rbExp);
        rgCafes=findViewById(R.id.rgCafes);
        rgCafes.setOnCheckedChangeListener(this);
        cbAzu=findViewById(R.id.cbAzu);
        cbAzu.setOnCheckedChangeListener(this);
        cbAzu.setEnabled(false);
        cbCrema=findViewById(R.id.cbCrema);
        cbCrema.setOnCheckedChangeListener(this);
        cbCrema.setEnabled(false);
        tvDescripcion=findViewById(R.id.tvDescripcion);
        etCant=findViewById(R.id.etCant);
        final Context cntApp=getApplicationContext();
        btnTotal=findViewById(R.id.btnTotal);
        btnTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String sCant=etCant.getEditableText().toString();
                iCantidades=Integer.parseInt(sCant);
                iTotalCafe=(iTotal*iCantidades)+iTotalExtras;
                tvDescripcion.setText(" ");
                Toast.makeText(cntApp,"Total: "+iTotalCafe,Toast.LENGTH_LONG).show();//Con este se agregan los textos de la clase anónima
                tvDescripcion.setText(iCantidades+" "+sDesc+ " "+sDescExtra );


            }
        });

    }



    @Override
    public void onCheckedChanged(RadioGroup group, int i) {
if (i==R.id.rbAme){
iTotal=20;
sDesc="Americano";
cbCrema.setEnabled(true);
cbAzu.setEnabled(true);
}else if(i==R.id.rbCapu) {
    iTotal=48;
    sDesc="Capuchino";
    cbCrema.setEnabled(true);
    cbAzu.setEnabled(true);
}else if(i==R.id.rbExp) {
iTotal=30;
    sDesc="Expresso";
    cbCrema.setEnabled(true);
    cbAzu.setEnabled(true);
}
    }



    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

if (cbAzu.isChecked()){
iTotalExtras=1*iCantidades;

    sDescExtra= "/ Azucar";

    if (cbCrema.isChecked()){
        iTotalExtras=iTotalExtras+(1*iCantidades);

        sDescExtra=sDescExtra+ "/ Crema";

    }

}else if(cbCrema.isChecked()){
    iTotalExtras=1*iCantidades;

    sDescExtra="/ Crema";
    if (cbAzu.isChecked()){
        iTotalExtras=iTotalExtras+(1*iCantidades);
        sDescExtra=sDescExtra+ "/ Azucar";

    }


}else if (cbCrema.isSelected()==false && cbAzu.isSelected()==false ){

    sDescExtra="";
    iTotalExtras=0;
}


    }
}

