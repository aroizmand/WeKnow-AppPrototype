package com.example.weknow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TheChat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_chat);
    }

    public void onBackButton(View view){
        Intent intent = new Intent(this, ChatMain.class);
        startActivity(intent);
    }

    public void onClickTom(View view){
        Intent intent = new Intent(this, ProfileTom.class);
        startActivity(intent);
    }
}