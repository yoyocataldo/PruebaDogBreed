package cl.dogbreed;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/*
1.- agregar dependencias y permisos ok
2.- activar viewbiding  ok
3.- crear package modelo: crear POJOS Y RETROFITCLIENT  CASI
4.- crear y diseñar LAYOUTS con RECLYCLERVIEW
5.- crear clase PRESENTER
6.- crear clase ADAPTER, VIEWHOLDER y enlazar esto a RECYCLERVIEW
7.- enlazar vista con presentador
 */






public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}