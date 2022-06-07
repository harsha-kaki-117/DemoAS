package com.Harsha.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class HomeActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);}

    @Override
    protected void onStart(){ super.onStart();}

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    public void homeButton(View view){
        Intent intent = new Intent(HomeActivity.this,HomeActivity.class);
        startActivity(intent);
    }

    public void loginButton(View view){
        Intent intent = new Intent(HomeActivity.this,LoginActivity.class);
        startActivity(intent);
    }

    public void registrationButton(View view){
        Intent intent = new Intent(HomeActivity.this,RegistrationActivity.class);
        startActivity(intent);
    }


}