package com.ajl.trabalhocalc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirActividade(View view){
        Intent intent = new Intent(this, CalculateActivity.class);
        startActivity(intent);
        //-----
    }


    public void abrirFibonacci(View view){
        Intent intent = new Intent(this, FiboActivity.class);
        startActivity(intent);
        //-----
    }

    public void abrirMdc(View view){
        Intent intent = new Intent(this, MDCActivity.class);
        startActivity(intent);
        //-----
    }

    public void abrirCalculadora(View view){
        Intent intent = new Intent(this, CalculadoraActivity.class);
        startActivity(intent);
        //-----
    }
}
