package com.example.senas_t;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.senas_t.adaptador.Galeria_Fotos_Adapter;

public class Galeria extends AppCompatActivity {
    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeria);

        gridView = (GridView)findViewById(R.id.gal_img);
        gridView.setAdapter(new Galeria_Fotos_Adapter(this));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(), ImagenCompleta.class);
                intent.putExtra("GlosarioLSM", i);
                startActivity(intent);
            }
        });
    }
}