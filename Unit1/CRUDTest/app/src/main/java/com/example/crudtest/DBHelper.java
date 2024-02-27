package com.example.crudtest;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    public DBHelper(@Nullable Context context) {
        super(context, "acronym_db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE ACRONYM_TABLE(ID INTEGER PRIMARY KEY AUTOINCREMENT,ACRONYM TEXT,MEANING TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public void insertData(String acronym,String meaning){
       SQLiteDatabase db=this.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put("ACRONYM",acronym);
        values.put("MEANING",meaning);
        db.insert("ACRONYM_TABLE",null,values);
       // db.execSQL("DELETE FROM ACRONYM_TABLE");

    }
    public Cursor displayData(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor c=db.rawQuery("SELECT * FROM ACRONYM_TABLE",null);
        return  c;

    }
    public void updateData(String Id,String acronym,String meaning){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put("ACRONYM",acronym);
        values.put("MEANING",meaning);
        db.update("ACRONYM_TABLE",values,"ID=?",new String[]{Id});
    }
    public  void deleteData(String Id){
        SQLiteDatabase db=this.getWritableDatabase();
        db.delete("ACRONYM_TABLE","ID=?",new String[]{Id});

    }
}
