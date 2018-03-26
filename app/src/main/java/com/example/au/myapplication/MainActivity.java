package com.example.au.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //View layout

    private Button vAumenta;
    private Button vDiminuisci;
    private TextView vMessaggio;
    private CheckBox vRaddoppio;
    private Button vAzzera;
    private Integer contatore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //Imposto riferimenti delle view.

        vAumenta = findViewById(R.id.incrementa);
        vDiminuisci = findViewById(R.id.decrementa);
        vAzzera = findViewById(R.id.azzeramento);
        vRaddoppio = findViewById(R.id.moltiplica);
        vMessaggio = findViewById(R.id.benvenuto);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Imposto azioni dei button.

        vAzzera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                contatore = 0;

            }
        });

        vAumenta.setOnClickListener(new View.OnClickListener()
            {
            @Override
            public void onClick(View view)
            {
                if(vRaddoppio.isChecked())
                {
                    contatore = contatore + 1;
                }

                contatore = contatore + 1;
                visualizzaMessaggio();
            }
        });

        vDiminuisci.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if(vRaddoppio.isChecked())
                {
                    contatore = contatore + 1;
                }

                contatore = contatore+1;
                visualizzaMessaggio();

            }
        });

    }

    /**
     * Con la sintassi "/**" e invio si crea l'help del metodo. Quando useremo tale metodo compariranno anche i parametri richiesti e di ritorno.
     */

    private void visualizzaMessaggio()
    {
        vMessaggio.setText(getString(R.string.valore) + contatore); //Per inserire un testo prima si inserisce nel file string xml!!!



    }
}
