package com.ajl.trabalhocalc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CalculadoraActivity extends AppCompatActivity {

    private double resultado=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
    }

    public void press1(View view){
        Intent intent=new Intent();
        TextView textView = findViewById(R.id.textView14);
        String texto=textView.getText().toString();

        if(texto.equalsIgnoreCase("0")){
            textView.setText("1");
        }else{
            textView.setText(texto+"1");
        }
    }
    public void press2(View view){
        Intent intent=new Intent();
        TextView textView = findViewById(R.id.textView14);
        String texto=textView.getText().toString();

        if(texto.equalsIgnoreCase("0")){
            textView.setText("2");
        }else{
            textView.setText(texto+"2");
        }
    }
    public void press3(View view){
        Intent intent=new Intent();
        TextView textView = findViewById(R.id.textView14);
        String texto=textView.getText().toString();

        if(texto.equalsIgnoreCase("0")){
            textView.setText("3");
        }else{
            textView.setText(texto+"3");
        }
    }
    public void press4(View view){
        Intent intent=new Intent();
        TextView textView = findViewById(R.id.textView14);
        String texto=textView.getText().toString();

        if(texto.equalsIgnoreCase("0")){
            textView.setText("4");
        }else{
            textView.setText(texto+"4");
        }
    }
    public void press5(View view){
        Intent intent=new Intent();
        TextView textView = findViewById(R.id.textView14);
        String texto=textView.getText().toString();

        if(texto.equalsIgnoreCase("0")){
            textView.setText("5");
        }else{
            textView.setText(texto+"5");
        }
    }
    public void press6(View view){
        Intent intent=new Intent();
        TextView textView = findViewById(R.id.textView14);
        String texto=textView.getText().toString();

        if(texto.equalsIgnoreCase("0")){
            textView.setText("6");
        }else{
            textView.setText(texto+"6");
        }
    }
    public void press7(View view){
        Intent intent=new Intent();
        TextView textView = findViewById(R.id.textView14);
        String texto=textView.getText().toString();

        if(texto.equalsIgnoreCase("0")){
            textView.setText("7");
        }else{
            textView.setText(texto+"7");
        }
    }
    public void press8(View view){
        Intent intent=new Intent();
        TextView textView = findViewById(R.id.textView14);
        String texto=textView.getText().toString();

        if(texto.equalsIgnoreCase("0")){
            textView.setText("8");
        }else{
            textView.setText(texto+"8");
        }
    }public void press9(View view){
        Intent intent=new Intent();
        TextView textView = findViewById(R.id.textView14);
        String texto=textView.getText().toString();

        if(texto.equalsIgnoreCase("0")){
            textView.setText("9");
        }else{
            textView.setText(texto+"9");
        }
    }
    public void press0(View view){
        Intent intent=new Intent();
        TextView textView = findViewById(R.id.textView14);
        String texto=textView.getText().toString();

        if(texto.equalsIgnoreCase("0")){
            textView.setText("0");
        }else{
            textView.setText(texto+"0");
        }
    }

    public void presSoma(View view){
        Intent intent=new Intent();
        TextView textView = findViewById(R.id.textView14);
        String texto=textView.getText().toString();
        String caracter=texto.charAt(texto.length()-1)+"";

        if(caracter.equalsIgnoreCase("-") || caracter.equalsIgnoreCase("X") || caracter.equalsIgnoreCase("/") || caracter.equalsIgnoreCase("+")){

            textView.setText(texto);
        }else{
            textView.setText(texto+"+");

        }

    }
    public void presSub(View view){
        Intent intent=new Intent();
        TextView textView = findViewById(R.id.textView14);
        String texto=textView.getText().toString();
        String caracter=texto.charAt(texto.length()-1)+"";

        if(caracter.equalsIgnoreCase("-") || caracter.equalsIgnoreCase("X") || caracter.equalsIgnoreCase("/") || caracter.equalsIgnoreCase("+")){

            textView.setText(texto);
        }else{
            textView.setText(texto+"-");

        }

    }
    public void presMult(View view){
        Intent intent=new Intent();
        TextView textView = findViewById(R.id.textView14);
        String texto=textView.getText().toString();
        String caracter=texto.charAt(texto.length()-1)+"";

        if(caracter.equalsIgnoreCase("-") || caracter.equalsIgnoreCase("X") || caracter.equalsIgnoreCase("/") || caracter.equalsIgnoreCase("+")){

            textView.setText(texto);
        }else{
            textView.setText(texto+"X");

        }

    }

    public void presDiv(View view){
        Intent intent=new Intent();
        TextView textView = findViewById(R.id.textView14);
        String texto=textView.getText().toString();
        String caracter=texto.charAt(texto.length()-1)+"";

        if(caracter.equalsIgnoreCase("-") || caracter.equalsIgnoreCase("X") || caracter.equalsIgnoreCase("/") || caracter.equalsIgnoreCase("+")){

            textView.setText(texto);
        }else{
            textView.setText(texto+"/");

        }

    }

    public void pressIgual(View view){
        Intent intent=new Intent();
        TextView textView = findViewById(R.id.textView14);
        String texto=textView.getText().toString();
        String textoResult="";
        String textoOper="";
        String caracter="";
        double resultado;
        int cont=1;
        for(int i=0; i<texto.length();i++){
            caracter=texto.charAt(i)+"";
            if(caracter.equalsIgnoreCase("+")){
                cont++;
            }else if(caracter.equalsIgnoreCase("-")){
                cont++;
            } else if(caracter.equalsIgnoreCase("/")){
                cont++;
            }else if(caracter.equalsIgnoreCase("X")){
                cont++;
            }
        }

        double [] valores=new double[cont];
        int j=0;
        for(int i=0; i<texto.length();i++){
            caracter=texto.charAt(i)+"";
            if(caracter.equalsIgnoreCase("+")){
                valores[j]=Double.parseDouble(textoOper);
                textoOper="";
                j++;
            }else if(caracter.equalsIgnoreCase("-")){
                valores[j]=Double.parseDouble(textoOper);
                textoOper="";
                textoOper="";
                j++;
            } else if(caracter.equalsIgnoreCase("/")){
                valores[j]=Double.parseDouble(textoOper);
                textoOper="";
                textoOper="";
                j++;
            }else if(caracter.equalsIgnoreCase("X")){
                valores[j]=Double.parseDouble(textoOper);
                textoOper="";
                textoOper="";
                j++;
            } else textoOper=textoOper+caracter;
        }
        valores[j]=Double.parseDouble(textoOper);

        resultado=valores[0];
        j=0;
        for(int i=0; i<texto.length();i++){
            caracter=texto.charAt(i)+"";
            if(caracter.equalsIgnoreCase("+")){
                j++;
                resultado=resultado+valores[j];
            }else if(caracter.equalsIgnoreCase("-")){
                j++;
                resultado=resultado-valores[j];
            } else if(caracter.equalsIgnoreCase("/")){
                j++;
                resultado=resultado/valores[j];
            }else if(caracter.equalsIgnoreCase("X")){
                j++;
                resultado=resultado*valores[j];
            }
        }

        textoResult=resultado+"";
        textView.setText(textoResult);
    }
}
