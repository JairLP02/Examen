package com.example.android.taller1;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Compra extends AppCompatActivity {


    private TextView compra;
    private Bundle b;
    private Resources res;
    private String aux,cant,mat,dijen,tipo,moneda,total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compra);

        compra = (TextView)findViewById(R.id.txtCompra);
        b = getIntent().getExtras();
        cant = b.getString("Cantidad");
        mat = b.getString("Material");
        dijen = b.getString("Dijen");
        tipo = b.getString("Tipo");
        moneda = b.getString("Moneda");
        total = b.getString("Total");
        res = this.getResources();

        aux ="Hola su compra es:"+" Cantidad "+cant+" Materia "+mat+" dijen "+dijen+" tipo"+tipo+"moneda "+moneda+" " + "El precio es: "+total;
        compra.setText(aux);



    }
}
