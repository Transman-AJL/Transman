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
        TextView textView2 = findViewById(R.id.editText4)

        TextView textView = findViewById(R.id.textView8);

        String resultadoS=textView1.getText().toString();
        int resultado=Integer.parseInt(resultadoS);

        resultado=fibonacci(resultado);
        resultadoS=resultado+" ";
        textView.setText(resultadoS);
        //startActivity(intent);
    }
}
