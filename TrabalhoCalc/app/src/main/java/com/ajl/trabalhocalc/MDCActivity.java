package com.ajl.trabalhocalc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MDCActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mdc);
    }

    public void calcularMdc(View view){

        Intent intent = new Intent();
        TextView textView1 = findViewById(R.id.editText3);
        TextView textView2 = findViewById(R.id.editText4);

        TextView textView = findViewById(R.id.textView13);

        String resultadoS1=textView1.getText().toString();
        String resultadoS2=textView2.getText().toString();

        int resultado1=Integer.parseInt(resultadoS1);
        int resultado2=Integer.parseInt(resultadoS2);

        resultado1=mdc(resultado1,resultado2);
        resultadoS1=resultado1+" ";
        textView.setText(resultadoS1);
        //startActivity(intent);
    }

    public static int mdc(int a,int b){

        if(b==0){
            return a;
        }else{
            return mdc(b,a%b);
        }
    }
}
