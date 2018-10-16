package com.turma.turmac3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clicar(View view){
        Intent intent=new Intent();
        TextView textView = findViewById(R.id.textView3);

        Toast.makeText(this,"Hello World", Toast.LENGTH_LONG).show();
        textView.setText("Hello World");
    }

}
