package com.example.weknow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Match extends AppCompatActivity {
    TextView name, learn, teach;
    ImageButton profile,accept, reject;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match);
        profile = findViewById(R.id.profile_picture);
        name = findViewById(R.id.textView2);
        learn = findViewById(R.id.learn);
        teach= findViewById(R.id.teaches);
        accept = findViewById(R.id.acceptBtn);
        reject = findViewById(R.id.acceptBtn2);
    }


    public void onClickMenu(View view){
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }

    public void onClickAccept(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Accepted!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Intent intent = new Intent(this, ChatMain.class);
        startActivity(intent);
    }

    public void onClickReject(View view){
        Context context = getApplicationContext();
        CharSequence text = "Rejected";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Intent intent = new Intent(this, ChatMain.class);
        startActivity(intent);
    }

    public void onClickOther(View view){
        Intent intent = new Intent(this, ProfileGabe.class);
        startActivity(intent);
    }


    public void onClickProfile(View view) {
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }

}
