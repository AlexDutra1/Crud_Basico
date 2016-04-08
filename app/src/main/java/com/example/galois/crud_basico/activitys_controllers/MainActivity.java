package com.example.galois.crud_basico.activitys_controllers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.galois.crud_basico.R;
import com.example.galois.crud_basico.persistencia.BancoController;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button botao = (Button) findViewById(R.id.buttonCadastrar);
        botao.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v2) {
                Intent intent2 = new Intent(MainActivity.this, Inserir.class);
                startActivity(intent2);
            }
        });

        Button botao3 = (Button) findViewById(R.id.buttonConsultar);
        botao3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick (View v){

                Intent intent = new Intent(MainActivity.this, Consulta.class);
                startActivity(intent);

                //Finaliza a activity anterior
                //finish();

            }
        });


    }//FIM DO ONCREATE


}
