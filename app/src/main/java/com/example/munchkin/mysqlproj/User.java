package com.example.munchkin.mysqlproj;

/**
 * Created by Munchkin on 7/16/2017.
 */

public class User {
    private long userID;
    private  String fName;
    private String lName;
    private String mName;
    private String emailAdd;
    private String pass;

    public User(String fName, String lName, String mName, String emailAdd,
                String pass){
        this.fName = fName;
        this.lName = lName;
        this.mName = mName;
        this.emailAdd = emailAdd;
        this.pass = pass;
    }
    public User(){

    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getEmailAdd() {
        return emailAdd;
    }

    public void setEmailAdd(String emailAdd) {
        this.emailAdd = emailAdd;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
