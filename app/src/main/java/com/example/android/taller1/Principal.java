package com.example.android.taller1;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class Principal extends AppCompatActivity {
    private EditText cajaCantidad;
    private Spinner comboMaterial;
    private Spinner comboComboDijen;
    private Spinner comboTipo;
    private RadioButton r1, r2;
    private Intent i;
    private Bundle b;
    private Resources res;
    private ArrayAdapter<String> adapter, adapter2, adapter3;
    private String[] opc, opc2, opc3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        cajaCantidad = (EditText) findViewById(R.id.txtCantidad);
        comboMaterial = (Spinner) findViewById(R.id.cmbMaterial);
        comboComboDijen = (Spinner) findViewById(R.id.cmbDijen);
        comboTipo = (Spinner) findViewById(R.id.cmbTipo);
        r1 = (RadioButton) findViewById(R.id.r1);
        r2 = (RadioButton) findViewById(R.id.r2);
        i = new Intent(this, Compra.class);
        b = new Bundle();
        res = this.getResources();
        opc = this.getResources().getStringArray(R.array.material);
        opc2 = this.getResources().getStringArray(R.array.dijen);
        opc3 = this.getResources().getStringArray(R.array.tipo);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, opc);
        adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, opc2);
        adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, opc3);

        comboMaterial.setAdapter(adapter);
        comboComboDijen.setAdapter(adapter2);
        comboTipo.setAdapter(adapter3);
    }

    public boolean validar() {
        if (cajaCantidad.getText().toString().isEmpty()) {
            cajaCantidad.setError(res.getString(R.string.error1));
            return false;
        }
        return true;
    }

    public void Compra(View v) {
        String cant, mat, dijen, tipo, moneda = "";
        if (validar()) {

            cant = cajaCantidad.getText().toString();
            mat = comboMaterial.getSelectedItem().toString();
            tipo = comboTipo.getSelectedItem().toString();
            dijen = comboComboDijen.getSelectedItem().toString();

            if (r1.isChecked()) moneda = getResources().getString(R.string.peso);
            if (r2.isChecked()) moneda = getResources().getString(R.string.dolar);

            b.putString("Cantidad", cant);
            b.putString("Material", mat);
            b.putString("Tipo", tipo);
            b.putString("Dijen", dijen);
            b.putString("Moneda", moneda);

            i.putExtras(b);

            startActivity(i);
        }
    }

    public void borrar(View v) {
        cajaCantidad.setText("");
        cajaCantidad.requestFocus();
        comboTipo.setSelection(0);
        comboComboDijen.setSelection(0);
        comboMaterial.setSelection(0);
        r1.setChecked(true);
    }

    public void calcularCant() {
        int cant = Integer.parseInt(cajaCantidad.getText().toString());
        if (comboMaterial.getSelectedItem() == 0 && comboComboDijen.getSelectedItem() == 0 && comboTipo.getSelectedItem() == 0) {
            int a = 100;
            if (r1.isChecked()== true){
                int peso = a * 3000 * cant;
            }else{
                r2.setChecked(true);
                int dolar = a * cant;
            }
        } else {
            if (comboMaterial.getSelectedItem() == 0 && comboComboDijen.getSelectedItem() == 0 && comboTipo.getSelectedItem() == 1) {
                int b = 80;
                if (r1.isChecked()== true){
                    int peso = b * 3000 * cant;
                }else{
                    r2.setChecked(true);
                    int dolar = b * cant;
                }

            } else {
                if (comboMaterial.getSelectedItem() == 0 && comboComboDijen.getSelectedItem() == 0 && comboTipo.getSelectedItem() == 2) {
                    int c = 70;
                    if (r1.isChecked()== true){
                        int peso = c * 3000 * cant;
                    }else{
                        r2.setChecked(true);
                        int dolar = c * cant;
                    }
                } else {

                    if (comboMaterial.getSelectedItem() == 0 && comboComboDijen.getSelectedItem() == 1 && comboTipo.getSelectedItem() == 0) {
                        int d = 120;
                        if (r1.isChecked()== true){
                            int peso = d * 3000 * cant;
                        }else{
                            r2.setChecked(true);
                            int dolar = d * cant;
                        }
                    }
                    if (comboMaterial.getSelectedItem() == 0 && comboComboDijen.getSelectedItem() == 1 && comboTipo.getSelectedItem() == 1) {
                        int e = 100;
                        if (r1.isChecked()== true){
                            int peso = e * 3000 * cant;
                        }else{
                            r2.setChecked(true);
                            int dolar = e * cant;
                        }
                    } else {

                        if (comboMaterial.getSelectedItem() == 0 && comboComboDijen.getSelectedItem() == 1 && comboTipo.getSelectedItem() == 2) {
                            int f = 90;
                            if (r1.isChecked()== true){
                                int peso = f * 3000 * cant;
                            }else{
                                r2.setChecked(true);
                                int dolar = f * cant;
                            }
                        } else {
                            if (comboMaterial.getSelectedItem() == 1 && comboComboDijen.getSelectedItem() == 0 && comboTipo.getSelectedItem() == 0) {
                                int g = 90;
                                if (r1.isChecked()== true){
                                    int peso = g * 3000 * cant;
                                }else{
                                    r2.setChecked(true);
                                    int dolar = g * cant;
                                }


                            } else {
                                if (comboMaterial.getSelectedItem() == 1 && comboComboDijen.getSelectedItem() == 0 && comboTipo.getSelectedItem() == 1) {
                                    int h = 70;
                                    if (r1.isChecked()== true){
                                        int peso = h * 3000 * cant;
                                    }else{
                                        r2.setChecked(true);
                                        int dolar = h * cant;
                                    }
                                } else {
                                    if (comboMaterial.getSelectedItem() == 1 && comboComboDijen.getSelectedItem() == 0 && comboTipo.getSelectedItem() == 2) {
                                        int j = 50;
                                        if (r1.isChecked()== true){
                                            int peso = j * 3000 * cant;
                                        }else{
                                            r2.setChecked(true);
                                            int dolar = j * cant;
                                        }
                                    } else {

                                        if (comboMaterial.getSelectedItem() == 1 && comboComboDijen.getSelectedItem() == 1 && comboTipo.getSelectedItem() == 0) {
                                            int k = 110;
                                            if (r1.isChecked()== true){
                                                int peso = k * 3000 * cant;
                                            }else{
                                                r2.setChecked(true);
                                                int dolar = k * cant;
                                            }
                                        } else {
                                            if (comboMaterial.getSelectedItem() == 1 && comboComboDijen.getSelectedItem() == 1 && comboTipo.getSelectedItem() == 1) {
                                                int l = 90;
                                                if (r1.isChecked()== true){
                                                    int peso = l * 3000 * cant;
                                                }else{
                                                    r2.setChecked(true);
                                                    int dolar = l * cant;
                                                }
                                            } else {


                                                if (comboMaterial.getSelectedItem() == 1 && comboComboDijen.getSelectedItem() == 1 && comboTipo.getSelectedItem() == 2) {
                                                    int m = 80;
                                                    if (r1.isChecked()== true){
                                                        int peso = m * 3000 * cant;
                                                    }else{
                                                        r2.setChecked(true);
                                                        int dolar = m * cant;
                                                    }
                                                }

                                            }
                                        }

                                    }


                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

