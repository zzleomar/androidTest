package com.example.leomar.myapplicationandoirdzzleomar;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class herramienta extends AppCompatActivity implements BussMenu {

    Fragment[] fragmentos={new Musica(),new Linterna(),new Nivel()};
    Fragment[] menuFrag={new MenuMusica(),new MenuLinterna(),new MenuNivel()};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_herramienta);

        Bundle datos=getIntent().getExtras();

        menu(datos.getInt("BOTONPULSADO"));
    }

    @Override
    public void menu(int botonx) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.menu,menuFrag[botonx]);
        ft.replace(R.id.contenedor,fragmentos[botonx]);
        ft.commit();
    }
}
