package com.Harsha.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Message_Activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
    }

    public void callButton(View view){
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:1234567890"));
        startActivity(intent);
    }

    public void msgButton(View view){
        Intent intent1 = new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:1234567890"));
        startActivity(intent1);

    }

    public void gmlButton(View view){
        Intent intent2 = new Intent(Intent.ACTION_SEND);
        intent2.setType("plain/text");
        startActivity(intent2);
    }

    public void mapButton(View view){
        Intent intent3 = new Intent(Intent.ACTION_VIEW,Uri.parse("geo:14.4850106,78.8242256"));
        startActivity(intent3);
    }

    public void websiteButton(View view){
        Intent intent4 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://oneharman.sharepoint.com/sites/harmanhub"));
        startActivity(intent4);
    }
}