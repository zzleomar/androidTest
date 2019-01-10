package com.example.leomar.myapplicationandoirdzzleomar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class home extends AppCompatActivity implements BussMenu{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    @Override
    public void menu(int botonx) {
        Intent in = new Intent(this,herramienta.class);
        in.putExtra("BOTONPULSADO", botonx);
        startActivity(in);
    }
}
