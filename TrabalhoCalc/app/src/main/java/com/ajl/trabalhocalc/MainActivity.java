package com.ajl.trabalhocalc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()== R.id.sobre){
            Toast.makeText(this,"By AJL (C)2018", Toast.LENGTH_LONG).show();
        }else{
            return super.onOptionsItemSelected(item);
        }
        return true;


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
