package com.Harsha.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }

    public void homeButton(View view){
        Intent intent = new Intent(RegistrationActivity.this,HomeActivity.class);
        startActivity(intent);
    }

    public void loginButton(View view){
        Intent intent = new Intent(RegistrationActivity.this,LoginActivity.class);
        startActivity(intent);
    }

    public void registrationButton(View view){
        Intent intent = new Intent(RegistrationActivity.this,RegistrationActivity.class);
        startActivity(intent);
    }
}