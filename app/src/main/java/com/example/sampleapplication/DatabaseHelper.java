package com.example.sampleapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.sampleapplication.Region;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String REGION = "Region";
    public static final String REGION_TABLE = "Region_table";
    public static final String NUMBER_OF_REPORTS = "Number_of_Reports";


    public DatabaseHelper(@Nullable Context context) {
        super(context, "region.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String QueryString = "CREATE TABLE " + REGION_TABLE + " (" + REGION + " VARCHAR(40), " + NUMBER_OF_REPORTS + " INTEGER)";

        Region ptgr = new Region("Pattangere", 0);
        Region kngri = new Region("Kengeri", 0);
        Region jnbrthi = new Region("Jnanabharathi", 0);


        db.execSQL(QueryString);
        insert(ptgr);
        insert(kngri);
        insert(jnbrthi);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

        db.execSQL("DROP TABLE " + REGION_TABLE);
        onCreate(db);

    }

    public void insert(Region rg){
        ContentValues cv = new ContentValues(2);

        cv.put(REGION, rg.getRegion_Name());
        cv.put(NUMBER_OF_REPORTS, rg.getNumber_of_Reports());

        SQLiteDatabase db = this.getWritableDatabase();
        db.insert(REGION_TABLE, null, cv);

    }

    public List<Region> getallregions(){

        List<Region> listofallregions = new ArrayList<>();

        SQLiteDatabase db = this.getReadableDatabase();
        String QueryString = "Select * FROM " + REGION_TABLE;

        Cursor cursor = db.rawQuery(QueryString, null);

        if(cursor.moveToFirst()){

            do{

                String Region_Name = cursor.getString(0);
                Integer Number_of_Reports = cursor.getInt(1);

                Region rg = new Region(Region_Name, Number_of_Reports);

                listofallregions.add(rg);
            }

            while(cursor.moveToNext());
        }
        cursor.close();
        db.close();

        return listofallregions;
    }

    public void increment_by_1(String region_name){

        SQLiteDatabase db = this.getWritableDatabase();
        String QueryString = "UPDATE " + REGION_TABLE + " SET " + NUMBER_OF_REPORTS + " = " + NUMBER_OF_REPORTS +  " + 1  WHERE " + REGION +  " = " + region_name;
        db.execSQL(QueryString);
    }
}
