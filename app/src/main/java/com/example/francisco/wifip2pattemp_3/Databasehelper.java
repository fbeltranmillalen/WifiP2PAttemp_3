package com.example.francisco.wifip2pattemp_3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Databasehelper extends SQLiteOpenHelper{
    public static final String DATABASE_NAME = "DBWIFIP2P";
    public static final String TABLE_NAME = "ENTREGA";

    public static final String COL_1 = "PARTES";
    public static final String COL_2 = "PARTESTOTALES";
    public static final String COL_3 = "SIZE";
    public static final String COL_4 = "PARTSIZE";
    public static final String COL_5 = "PORCENTAJE";
    public static final String COL_6 = "TIEMPOENCUENTRO";
    public static final String COL_7 = "TIEMPOHANDSHAKE";
    public static final String COL_8 = "TIEMPOCONEXION";
    public static final String COL_9 = "TIEMPOCABECERA";
    public static final String COL_10 = "TIEMPOINICIOMENSAJE";
    public static final String COL_11 = "TIEMPOTIEMPOFINMENSAJE";
    public static final String COL_12 = "TIEMPODESCONEXION";
    public static final String COL_13 = "TIEMPODB1";
    public static final String COL_14 = "TIEMPODB2";




    //public static final String TABLE_NAME = "HANDSHAKE";

    //public static final String TABLE_NAME = "BANDEJA";

    //public static final String TABLE_NAME = "MENSAJE";

    //public static final String TABLE_NAME = "PARTES";
    //public static final String TABLE_NAME = "TIEMPO";


    public Databasehelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();
        int nosirve = 0;

        //probando nuevo git
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

      db.execSQL("create table " + TABLE_NAME +"(COL_1 INTERGER, PARTESTOTALES INTERGER, SIZE INTERGER, PARTSIZE INTERGER, PORCENTAJE REAL, TIEMPOENCUENTRO REAL, TIEMPOHANDSHAKE REAL, TIEMPOCONEXION REAL, TIEMPOCABECERA REAL, TIEMPOINICIOMENSAJE REAL, TIEMPOFINMENSAJE REAL, TIEMPODESCONEXION REAL, TIEMPODB1 REAL, TIEMPODB2 REAL )");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
       db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
       onCreate(db);
    }
}
