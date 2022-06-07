package com.Harsha.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void homeButton(View view){
        Intent intent = new Intent(LoginActivity.this,HomeActivity.class);
        startActivity(intent);
    }

    public void loginButton(View view){
        Intent intent = new Intent(LoginActivity.this,LoginActivity.class);
        startActivity(intent);
    }

    public void registrationButton(View view){
        Intent intent = new Intent(LoginActivity.this,RegistrationActivity.class);
        startActivity(intent);
    }
}