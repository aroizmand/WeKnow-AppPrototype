package com.example.weknow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Resources extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resources);
    }

    public void OnClicktypesofguitar(View view){
        Intent intent = new Intent(this, TypesGuitar.class);
        startActivity(intent);
    }
    public void onClickMenu(View view){
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }



    public void onClickProfile(View view) {
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }
}