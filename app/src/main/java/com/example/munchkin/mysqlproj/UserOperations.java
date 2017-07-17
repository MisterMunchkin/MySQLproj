package com.example.munchkin.mysqlproj;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Munchkin on 7/16/2017.
 */

public class UserOperations {

    public static final String LOGTAG = "USER_MNGMNT_SYS";

    SQLiteOpenHelper dbhandler;
    SQLiteDatabase database;

    private static final String[] allColumns = {
            UserDBHandler.COLUMN_USERID,
            UserDBHandler.COLUMN_USERTYPE,
            UserDBHandler.COLUMN_USERFIRSTNAME,
            UserDBHandler.COLUMN_USERLASTNAME,
            UserDBHandler.COLUMN_USERMI,
            UserDBHandler.COLUMN_USERPASSWORD,
            UserDBHandler.COLUMN_USEREMAIL
    };
    public UserOperations(Context context){
        dbhandler = new UserDBHandler(context);
    }

    public void open(){
        Log.i(LOGTAG,"Database Opened");
        database = dbhandler.getWritableDatabase();
    }

    public void close(){
        Log.i(LOGTAG, "Database Closed");
        dbhandler.close();
    }

    public User addUser(User user){
        ContentValues values = new ContentValues();
        values.put(UserDBHandler.COLUMN_USERTYPE,user.getfName());
        values.put(UserDBHandler.COLUMN_USERLASTNAME,user.getlName());
        values.put(UserDBHandler.COLUMN_USERMI, user.getmName());
        values.put(UserDBHandler.COLUMN_USERPASSWORD, user.getPass());
        values.put(UserDBHandler.COLUMN_USEREMAIL, user.getEmailAdd());

        long insertid = database.insert(UserDBHandler.TABLE_ACCOUNT,null,values);
        user.setUserID(insertid);
        return user;
    }
}
