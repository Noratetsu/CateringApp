package g6.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import group6.cateringapp.SignUpDetails;

/**
 * Created by ssaze on 4/27/2018.
 */

public class dbmgr extends SQLiteOpenHelper{
    private static dbmgr instance = null;
    private static final int database_version = 1;
    private static final String database_name = "CateringApp.db";
    private static final String table_name = "registration";
    private static final String column_id = "id";
    private static final String column_fname = "FirstName";
    private static final String column_lname = "LastName";
    private static final String column_uname = "UserName";
    private static final String column_usertype = "UserType";
    private static final String column_email = "Email";
    private static final String column_phone = "Phone";
    private static final String column_address = "Address";
    private static final String column_city = "City";
    private static final String column_password = "Password";
   // SQLiteDatabase db;
   //String table_create = "CREATE TABLE registration (ID integer primary key not null, FirstName text, LastName text, UserName text, Password text, UserType text, Email text, phone text, Address text, City text);";

    private dbmgr (Context context){
        super(context, database_name,null,database_version);

    }

    public static dbmgr getInstance(Context context){

        instance = new dbmgr(context);
        return instance;
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String table_create = "CREATE TABLE registration (ID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, FirstName TEXT, LastName TEXT, UserName TEXT, Password TEXT, UserType TEXT, Email TEXT, phone TEXT, Address TEXT, City TEXT);";
        sqLiteDatabase.execSQL(table_create);

        /*db.execSQL(table_create);
        this.db = db;*/
    }
    public void InsertDetails(SignUpDetails c){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        String query = "SELECT * FROM registration;";
        //Cursor cursor = db.rawQuery(query,null);
      //  int count = cursor.getCount();
      //  values.put(column_id, count);
        values.put(column_fname,c.getFirst_name());
        values.put(column_lname,c.getLast_name());
        values.put(column_uname,c.getUser_name());
        values.put(column_usertype,c.getUser_type());
        values.put(column_email,c.getEmail());
        values.put(column_phone,c.getPhone());
        values.put(column_address,c.getAddress());
        values.put(column_city,c.getCity());
        values.put(column_password,c.getPassword());

        db.insert(table_name, null, values);
        db.close();
    }

    public String searchPass(String uname){
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "SELECT " + column_uname + " , " + column_password + " FROM " + table_name + ";";
        Cursor cursor = db.rawQuery(query,null);
        String uname_on_record;
        String password_on_record = "not found";
        if(cursor.moveToFirst()){
            do{
                uname_on_record = cursor.getString(0);
                if (uname_on_record.equals(uname)){
                    password_on_record = cursor.getString(1);
                    break;
                }
            }
            while(cursor.moveToNext());
        }
        return password_on_record;
    }

    public String searchUserType(String uname){
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "SELECT " + column_uname + " , " + column_usertype+ " FROM " + table_name + ";";
        Cursor cursor = db.rawQuery(query,null);
        String uname_on_record;
        String usertype_on_record = "not valid user";
        if(cursor.moveToFirst()){
            do{
                uname_on_record = cursor.getString(0);
                if (uname_on_record.equals(uname)){
                    usertype_on_record = cursor.getString(1);
                    break;
                }
            }
            while(cursor.moveToNext());
        }
        return usertype_on_record;

    }

    /*public SignUpDetails retrieveUser(String username, String password) {
        SQLiteDatabase db = this.getWritableDatabase();

        String query = "SELECT * from " + table_name + " WHERE " + column_uname + " = "
                + username + "AND" + column_password + " = " + password + ";";
        Cursor cursor = db.rawQuery(query, null);

        SignUpDetails model = new SignUpDetails();

        if (cursor.moveToFirst()) {
            model.setId(cursor.getInt(cursor.getColumnIndex(column_id)));
            model.setFirst_name(cursor.getString(cursor.getColumnIndex(column_fname)));
            model.setLast_name(cursor.getString(cursor.getColumnIndex(column_lname)));
            model.setUser_name(cursor.getString(cursor.getColumnIndex(column_uname)));
            model.setPassword(cursor.getString(cursor.getColumnIndex(column_password)));
            model.setUser_type(cursor.getString(cursor.getColumnIndex(column_usertype)));
            model.setEmail(cursor.getString(cursor.getColumnIndex(column_email)));
            model.setPhone(cursor.getString(cursor.getColumnIndex(column_phone)));
            model.setAddress(cursor.getString(cursor.getColumnIndex(column_address)));
            model.setCity(cursor.getString(cursor.getColumnIndex(column_city)));
        } else {
            model = null;
        }
        return model;
    }*/
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        //String query = "drop table if exists" + table_name;
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + table_name);
        onCreate(sqLiteDatabase);
        // db.execSQL(query);
        //this.onCreate(db);
    }
}