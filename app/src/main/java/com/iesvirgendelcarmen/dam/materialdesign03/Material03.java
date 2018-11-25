package com.iesvirgendelcarmen.dam.materialdesign03;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

public class Material03 extends AppCompatActivity implements View.OnClickListener {

    Animation abrir, cerrar, derecha, izquierda;
    boolean abierto, abiertoIz;
    FloatingActionButton fab1, fab2, fab3, fab1iz, fab2iz, fab3iz, fab4iz;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material03);

        fab1 = findViewById(R.id.fab1);
        fab2 = findViewById(R.id.fab2);
        fab3 = findViewById(R.id.fab3);
        fab1iz = findViewById(R.id.fabIzq1);
        fab2iz = findViewById(R.id.fabIzq2);
        fab3iz = findViewById(R.id.fabIzq3);
        fab4iz = findViewById(R.id.fabIzq4);

        fab1.setOnClickListener(this);
        fab2.setOnClickListener(this);
        fab3.setOnClickListener(this);

        abierto = false;
        abiertoIz = false;

        abrir = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.abrir);
        cerrar = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.cerrar);
        derecha = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.derecha);
        izquierda = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.izquierda);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.fab1:
                Toast.makeText(this,"Tocado boton3",Toast.LENGTH_SHORT).show();
                break;
            case R.id.fab2:
                if (abiertoIz){
                    fab1iz.startAnimation(cerrar);
                    fab2iz.startAnimation(cerrar);
                    fab3iz.startAnimation(cerrar);
                    fab4iz.startAnimation(cerrar);
                    fab2.startAnimation(izquierda);
                    fab1iz.setClickable(false);
                    fab2iz.setClickable(false);
                    fab3iz.setClickable(false);
                    fab4iz.setClickable(false);
                    abiertoIz = false;
                } else{
                    fab1iz.startAnimation(abrir);
                    fab2iz.startAnimation(abrir);
                    fab3iz.startAnimation(abrir);
                    fab4iz.startAnimation(abrir);
                    fab2.startAnimation(derecha);
                    fab1iz.setClickable(true);
                    fab2iz.setClickable(true);
                    fab3iz.setClickable(true);
                    fab4iz.setClickable(true);
                    abiertoIz = true;
                }
                break;
            case R.id.fab3:
                if (abierto){
                    fab1.startAnimation(cerrar);
                    fab2.startAnimation(cerrar);
                    fab3.startAnimation(izquierda);
                    fab2.setClickable(false);
                    fab1.setClickable(false);
                    abierto = false;
                } else{
                    fab1.startAnimation(abrir);
                    fab2.startAnimation(abrir);
                    fab3.startAnimation(derecha);
                    fab2.setClickable(true);
                    fab1.setClickable(true);
                    abierto = true;
                }
                break;
        }

    }
}
