package com.practicas.calculadoranumerosprimos;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Rating;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int resultado;
    public Editable posicion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void resultado(View view){

        EditText editTextPosicion = findViewById(R.id.editTxtPosicion);
        posicion=editTextPosicion.getText();

        calculoNumerosPrimos(Integer.parseInt(posicion.toString()));

    }

    public void calculoNumerosPrimos(int posicion) {
        int contador;
        int numero = 3;
        boolean primo;
        int posNumPrimo = 2;

        if (posicion == 1) {
            mostrarResultado(posicion);
        }else if(posicion == 2){
            mostrarResultado(posicion);
        }else{
            do{
                contador=2;
                primo=true;
                while ((primo) && (contador!=numero)){
                    if (numero % contador == 0){
                        primo = false;
                    }
                    contador++;
                }
                if (primo){
                    posNumPrimo++;
                }
                if (posNumPrimo==posicion){
                    mostrarResultado(numero);
                }
                numero++;
            }while (posNumPrimo < posicion);

        }


    }

    public void mostrarResultado(int resultado){
        TextView txtResultado = (TextView) findViewById(R.id.txtResultado);
        txtResultado.setText(String.valueOf(resultado));
        txtResultado.setVisibility(View.VISIBLE);
    }
}