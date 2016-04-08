package com.example.galois.crud_basico.persistencia;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by galois on 05/04/16.
 */
public class CriaBanco extends SQLiteOpenHelper {


    public static final String NOME_BANCO = "banco.db";
    public static final String TABELA = "livros";
    public static final String ID = "_id";
    public static final String TITULO = "titulo";
    public static final String AUTOR = "autor";
    public static final String EDITORA = "editora";
    public static final int VERSAO = 1;


    public CriaBanco(Context context){
        super(context, NOME_BANCO,null,VERSAO);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

/*

        StringBuilder sqlBuilder= new StringBuilder();
        sqlBuilder.append("CREATE TABLE livros (' ");
        sqlBuilder.append("id integer primary key autoincrement,");
        sqlBuilder.append("titulo varchar (14),");
        sqlBuilder.append("autor varchar (14),");
        sqlBuilder.append("editora varchar (14),");
        sqlBuilder.append(");");
*/
/*
        String sqlBrutao="CREATE TABLE livros(id integer primary key autoincrement,titulo text,autor text,editora text);";
        db.execSQL(sqlBrutao);
*/

/*

        db.execSQL(sqlBuilder.toString());
*/

      //BACKUP

            String sql = "CREATE TABLE "+TABELA+"("
                    + ID + " integer primary key autoincrement,"
                    + TITULO + " text,"
                    + AUTOR + " text,"
                    + EDITORA + " text"
                    +")";
            db.execSQL(sql);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS" + TABELA);
        onCreate(db);
    }




}
