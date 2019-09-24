package com.example.balaiodelenharestaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.app.*;


public class MainActivity extends AppCompatActivity {

    //------botoes--e--texts --------
    EditText txtConsumoTot, txtCouvArt, txtDivConta, txtTaxa, txtContaTot, txtValPessoa;
    Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //---puxando os valores para as variaveis---
        txtConsumoTot = (EditText) findViewById(R.id.txtConsumoTot);
        txtCouvArt = (EditText) findViewById(R.id.txtCouvArt);
        txtDivConta = (EditText) findViewById(R.id.txtDivConta);
        txtTaxa = (EditText) findViewById(R.id.txtTaxa);
        txtContaTot = (EditText) findViewById(R.id.txtContaTot);
        txtValPessoa = (EditText) findViewById(R.id.txtValPessoa);
        btnCalcular = (Button) findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double cons = Double.parseDouble(txtConsumoTot.getText().toString());
                double couv = Double.parseDouble(txtCouvArt.getText().toString());
                double taxaServ = cons * 0.10;
                double dividir = Double.parseDouble(txtDivConta.getText().toString());

                //Consumo
                double contaTot = cons + taxaServ + couv ;
                txtContaTot.setText(String.valueOf(contaTot));

                //Taxa serviço
                txtTaxa.setText(String.valueOf(taxaServ));

                //Dividir
                double div = contaTot / dividir;
                txtValPessoa.setText(String.valueOf(div));

            }
        });

    }
}