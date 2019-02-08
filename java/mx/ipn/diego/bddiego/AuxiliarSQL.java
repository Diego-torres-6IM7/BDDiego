package mx.ipn.diego.bddiego;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Profesor on 08/02/2019.
 */

public class AuxiliarSQL extends SQLiteOpenHelper {

    String Nombres = "create table Nombres ("
            +"_id integer primary key autoincrement,"+
            "Nombre text";

    public AuxiliarSQL(Context context, String DBname, SQLiteDatabase.CursorFactory factory, int version){
        super(context, DBname, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Nombres);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    db.execSQL("drop table if exists Nombres");
    db.execSQL(Nombres);
    }
}
