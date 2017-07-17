package com.example.munchkin.mysqlproj;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Munchkin on 7/16/2017.
 */

public class UserDBHandler extends SQLiteOpenHelper{

    private static final String DATABASE_NAME = "android demo";
    private static int DATABASE_VERSION = 1;

    public static final String TABLE_ACCOUNT = "account";
    public static final String COLUMN_USERID = "userID";
    public static final String COLUMN_USERTYPE = "userType";
    public static final String COLUMN_USERFIRSTNAME = "userFirstName";
    public static final String COLUMN_USERLASTNAME = "userLastName";
    public static final String COLUMN_USERMI = "userMI";
    public static final String COLUMN_USERPASSWORD = "userpassword";
    public static final String COLUMN_USEREMAIL = "userEmail";


    public UserDBHandler(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
