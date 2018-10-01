package com.ajl.trabalhocalc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FiboActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fibo);
    }

    public void calcularFibo(View view){

        Intent intent = new Intent();
        TextView textView1 = findViewById(R.id.editText2);

        TextView textView = findViewById(R.id.textView8);

        String resultadoS=textView1.getText().toString();
        int resultado=Integer.parseInt(resultadoS);

        if(resultado<0){
            textView.setText("Número Inválido");
        }else{
            resultado=fibonacci(resultado);
            resultadoS=resultado+" ";
            textView.setText(resultadoS);
        }

        //startActivity(intent);
    }

    public static int fibonacci(int n){

        if(n<2){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
