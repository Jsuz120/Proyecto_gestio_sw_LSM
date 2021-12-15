package com.example.traductor_senas.activity.activity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.traductor_senas.R;

import java.util.ArrayList;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

        private static final int REQ_CODE_SPEECH_INPUT=100;
        private TextView mEntradaVoz;
        private ImageButton mBotonHablar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEntradaVoz=findViewById(R.id.textoEntrada);
        mBotonHablar=findViewById(R.id.botonHablar);

        mBotonHablar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iniciarEntrdaVoz();
            }
        });
    }

    private void iniciarEntrdaVoz(){
        Intent intent=new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
        intent.putExtra(RecognizerIntent.EXTRA_PROMPT, "Hola dime lo que sea");
        try {
            startActivityForResult(intent,REQ_CODE_SPEECH_INPUT);
        }catch (ActivityNotFoundException e){

        }
    }

    protected  void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode,resultCode, data);

        switch (requestCode){
            case REQ_CODE_SPEECH_INPUT:{
                if(resultCode==RESULT_OK && null!=data){
                    ArrayList<String> result=data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    mEntradaVoz.setText(result.get(0));
                }
                break;
            }
        }
    }
}