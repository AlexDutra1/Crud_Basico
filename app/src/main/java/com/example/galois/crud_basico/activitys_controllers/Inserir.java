package com.example.galois.crud_basico.activitys_controllers;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.galois.crud_basico.R;
import com.example.galois.crud_basico.persistencia.BancoController;

/**
 * Created by galois on 08/04/16.
 */
public class Inserir extends Activity {

    Button voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inserir);

        Button botao = (Button) findViewById(R.id.button);

        botao.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                BancoController crud = new BancoController(getBaseContext());

                EditText titulo = (EditText) findViewById(R.id.editTextTitulo);
                EditText autor = (EditText) findViewById((R.id.editTextAutor));
                EditText editora = (EditText) findViewById(R.id.editTextEditora);

                String tituloString = titulo.getText().toString();
                String autorString = autor.getText().toString();
                String editoraString = editora.getText().toString();
                String resultado;

                //TESTE

                System.out.println("Titulo: " + tituloString);
                System.out.println("Autor: " + autorString);
                System.out.println("Editora: " + editoraString);

                resultado = crud.insereDado(tituloString, autorString, editoraString);

                Toast.makeText(getApplicationContext(), resultado, Toast.LENGTH_LONG).show();
            }
        });

        voltar = (Button)findViewById(R.id.buttonVoltar);
        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Inserir.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }//FIM DO ONCREATE
}
