package com.practicas.calculadoranumerosprimos;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Rating;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int resultado=10;
    public Editable posicion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void resultado(View view){
        TextView txtResultado = (TextView) findViewById(R.id.txtResultado);
        EditText editTextPosocion = findViewById(R.id.editTxtPosicion);
        posicion=editTextPosocion.getText();

        txtResultado.setText(posicion);
        txtResultado.setVisibility(View.VISIBLE);
    }
}