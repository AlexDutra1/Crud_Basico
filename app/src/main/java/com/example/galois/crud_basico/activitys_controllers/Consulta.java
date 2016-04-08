package com.example.galois.crud_basico.activitys_controllers;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.widget.SimpleCursorAdapter;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.example.galois.crud_basico.R;
import com.example.galois.crud_basico.persistencia.BancoController;
import com.example.galois.crud_basico.persistencia.CriaBanco;

/**
 * Created by galois on 06/04/16.
 */
public class Consulta extends Activity {

    private ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulta);

        BancoController crud = new BancoController(getBaseContext());

        //A IDE ou a Persistencia pediu para Cursor ser final
        final Cursor cursor = crud.carregaDados();

        String[] nomeCampos = new String[] {CriaBanco.ID, CriaBanco.TITULO};
        int[] idViews = new int[] {R.id.idLivro, R.id.nomeLivro};

        //NECESSARIO FAZER O UPDGRADE DA API PARA USAR O SimpleCursorAdapter'
        SimpleCursorAdapter adaptador = new SimpleCursorAdapter(getBaseContext(),
                R.layout.livros_layout,cursor,nomeCampos,idViews, 0);

        lista = (ListView)findViewById(R.id.listView);
        lista.setAdapter(adaptador);

        //Abaixo para funcionalidade de alteração
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String codigo;
                cursor.moveToPosition(position);
                codigo = cursor.getString(cursor.getColumnIndexOrThrow(CriaBanco.ID));
                Intent intent = new Intent(Consulta.this, Alterar.class);
                intent.putExtra("codigo", codigo);
                startActivity(intent);
                finish();
            }
        });

        Button voltar;
        voltar = (Button)findViewById(R.id.buttonVoltar);
        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Consulta.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }



}
