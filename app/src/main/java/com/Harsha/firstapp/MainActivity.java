package com.Harsha.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {
    Button Login;
    Button Create;

    EditText UserName;
    EditText Password;

    SharedPreferences sharedPreferences;
    public static final String MyPreference = "MyPreference";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String username = UserName.getText().toString();
        String pswd = Password.getText().toString();

        sharedPreferences = getSharedPreferences(MyPreference, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("name", String.valueOf(UserName));
        editor.commit();

        if(username=="Harman" && pswd=="Harman"){
            Login = findViewById(R.id.button);
            Login.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Toast.makeText(MainActivity.this,"Login Successful",Toast.LENGTH_LONG).show();
                }
            });
        }
        else{

            Create = findViewById(R.id.button2);
            Create.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SharedPreferences sh = getSharedPreferences(MyPreference,Context.MODE_PRIVATE);
                    String data = sh.getString("name","0");
                    txtVw.setText(data);
                    Toast.makeText(MainActivity.this,"Credentials doesn't match!Create New Account",Toast.LENGTH_LONG).show();
                }
            });

        }
    }
}