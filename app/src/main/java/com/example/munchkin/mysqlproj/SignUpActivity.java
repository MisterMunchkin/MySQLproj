package com.example.munchkin.mysqlproj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {
    EditText firstNameET, lastNameET,middleNameET, emailAddET, passwordET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        firstNameET = (EditText)findViewById(R.id.etFirstName);
        lastNameET = (EditText)findViewById(R.id.etLastName);
        middleNameET = (EditText)findViewById(R.id.etMiddleName);
        emailAddET = (EditText)findViewById(R.id.etEmail);
        passwordET = (EditText)findViewById(R.id.etPassword);

    }

    public void HaveAccount(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void OnReg(View view){

        String fName, lName, mName, emailAdd, pass;

        fName = firstNameET.getText().toString();
        lName = lastNameET.getText().toString();
        mName = middleNameET.getText().toString();
        emailAdd = emailAddET.getText().toString();
        pass = passwordET.getText().toString();

        String type = "register";


        BackgroundWorker BW = new BackgroundWorker(this);

        BW.execute(type,fName,lName, mName, emailAdd, pass);

       /*
        User U = new User();
        CrudDaoUser CU = new CrudDaoUser();

        U.setfName(firstNameET.getText().toString());
        U.setlName(lastNameET.getText().toString());
        U.setmName(middleNameET.getText().toString());
        U.setEmailAdd(emailAddET.getText().toString());
        U.setPass(passwordET.getText().toString());

        CU.addNewUser(U);

        User U = new User();
        UserOperations UO = new UserOperations(this);


        U.setfName(firstNameET.getText().toString());
        U.setlName(lastNameET.getText().toString());
        U.setmName(middleNameET.getText().toString());
        U.setEmailAdd(emailAddET.getText().toString());
        U.setPass(passwordET.getText().toString());

        UO.addUser(U);
         */
    }
}
