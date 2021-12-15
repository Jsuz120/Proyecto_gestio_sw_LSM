package com.example.senas_t;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.senas_t.adaptador.Galeria_Fotos_Adapter;

public class ImagenCompleta extends AppCompatActivity {

    ImageView imageView;
    Galeria_Fotos_Adapter galeria_fotos_adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagen_completa);

        imageView = (ImageView)findViewById(R.id.iv_foto);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Seña Completa");

        Intent intent = getIntent();
        int i = intent.getExtras().getInt("GlosarioLSM");
        galeria_fotos_adapter = new Galeria_Fotos_Adapter(this);
        imageView.setImageResource(galeria_fotos_adapter.imageArray[i]);
    }
}