package com.ajl.trabalhocalc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CalculateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);
    }



    public void calcularFactorial(View view){

        Intent intent = new Intent();
        TextView textView0 = findViewById(R.id.editText);

        TextView textView = findViewById(R.id.textView3);

        String resultadoS=textView0.getText().toString();
        int resultado=Integer.parseInt(resultadoS);

        resultado=fatorial(resultado);
        resultadoS=resultado+" ";
        textView.setText(resultadoS);
        //startActivity(intent);
    }

    public int fatorial(int numero){
        if(numero==0){
            return 1;
        }
        if(numero==1){
            return 1;
        }
        else{
            return numero*fatorial(numero-1);
        }

    }
}
