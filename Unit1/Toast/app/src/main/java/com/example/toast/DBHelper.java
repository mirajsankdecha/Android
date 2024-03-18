package com.example.toast;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    public DBHelper(@Nullable Context context) {
        super(context, "mydb", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE STUDENT (ID INTEGER PRIMARY KEY,NAME TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void insertData(String Id,String Name){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("ID",Id);
        cv.put("NAME",Name);
        db.insert("STUDENT",null,cv);
    }

    public Cursor displayData() {
        SQLiteDatabase db = getWritableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM STUDENT",null);
        return c;
    }

    public void updateData(String Id,String Name)
    {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("ID",Id);
        cv.put("NAME",Name);
        db.update("STUDENT",cv,"ID=?",new String []{Id});
    }
    public void deleteData(String Id,String Name)
    {
        SQLiteDatabase db = getWritableDatabase();
        db.delete("STUDENT","ID=?",new String []{Id});
    }
}