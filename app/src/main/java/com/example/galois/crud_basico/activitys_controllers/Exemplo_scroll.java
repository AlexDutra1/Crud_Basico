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
 * Created by galois on 08/04/16.
 */
public class Exemplo_scroll extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemplo_scroll);


    }
}
