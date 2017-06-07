package com.example.jd.sqlitedatabasedemo;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by JD on 01-06-2017.
 */

public class MycoreDatabase extends SQLiteOpenHelper {
    static  final private String DB_NAME="Tuna";
    static  final private  String DB_TABLE="Student";
    static  final private int DB_VERSION=1;
   Context ct;
    SQLiteDatabase mydb;

    public MycoreDatabase(Context c){
        super(c,DB_NAME,null,DB_VERSION);
        ct=c;


    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table"+DB_TABLE+" (_id integer primary key autoincrement,stu_name text,collage_name text,);");
        Log.i("Databse","Table create");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
    sqLiteDatabase.execSQL("drop table if exists"+DB_TABLE);
        onCreate(sqLiteDatabase);
    }
    public  void insertData(String s1,String s2){
        mydb=getWritableDatabase();
        mydb.execSQL("insert into"+DB_TABLE+" (stu_name,collage_name) values('"+s1+"','"+s2+"');");
        Toast.makeText(ct,"Data saved",Toast.LENGTH_SHORT).show();
    }
    public void getall(){
        mydb =getReadableDatabase();
        Cursor cur = mydb.rawQuery("Select * from "+DB_TABLE,null);
        StringBuilder str=new StringBuilder();
        while (cur.moveToNext()){
            String s1=cur.getString(1);
            String s2=cur.getString(2);
            str.append(s1+" "+s2+" \n");

        }
        Toast.makeText(ct,str.toString(),Toast.LENGTH_SHORT).show();
    }

}
