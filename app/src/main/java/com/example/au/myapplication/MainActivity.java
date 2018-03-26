package com.example.au.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //View layout

    private Button vAumenta;
    private Button vDiminuisci;
    private TextView vMessaggio;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //Imposto riferimenti delle view.

        vAumenta = findViewById(R.id.incrementa);
        vDiminuisci = findViewById(R.id.decrementa);
        vMessagio = findViewById(R.id.benvenuto);




        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
