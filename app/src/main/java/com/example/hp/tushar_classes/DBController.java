package com.example.hp.tushar_classes;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by hp on 4/21/2018.
 */

public class DBController extends SQLiteOpenHelper {
    private static final String tablename = "places";  // tablename
    private static final String place = "place";  // column name
    private static final String id = "ID";  // auto generated ID column
    private static final String country = "country"; // column name
    private static final String databasename = "placesinfo"; // Dtabasename
    private static final int versioncode = 1; //versioncode of the database

    public DBController(Context context) {
        super(context, databasename, null, versioncode);

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String query;
        query = "CREATE TABLE IF NOT EXISTS " + tablename + "(" + id + " integer, " + place + " text, " + country + " integer primary key)";
        sqLiteDatabase.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String query;
        query = "DROP TABLE IF EXISTS " + tablename;
        sqLiteDatabase.execSQL(query);
        onCreate(sqLiteDatabase);
    }
    public ArrayList<HashMap<String, String>> getAllPlace() {
        ArrayList<HashMap<String, String>> wordList;
        wordList = new ArrayList<HashMap<String, String>>();
        String selectQuery = "SELECT  * FROM " + tablename;
        SQLiteDatabase database = this.getWritableDatabase();
        Cursor cursor = database.rawQuery(selectQuery, null);
        if (cursor.moveToFirst()) {
            do {

                HashMap<String, String> map = new HashMap<String, String>();
                map.put("id", cursor.getString(0));
                map.put("place", cursor.getString(1));
                map.put("country", cursor.getString(2));

                wordList.add(map);
            } while (cursor.moveToNext());
        }

        // return contact list
        return wordList;
    }
}