package com.example.weknow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TypesGuitar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_types_guitar);
    }
    public void onClickacoustic(View view){
        Intent intent = new Intent(this, AcusticGuitar.class);
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

    public void onBackButton(View view){
        Intent intent = new Intent(this, Resources.class);
        startActivity(intent);
    }


}