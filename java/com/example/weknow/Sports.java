package com.example.weknow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Sports extends AppCompatActivity {
    Button football, basketball, baseball, tennis;
    Button[] all_sports;
    int status_foot,status_base,status_bask,status_ten;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);
        football = findViewById(R.id.football);
        baseball = findViewById(R.id.baseball);
        basketball = findViewById(R.id.basketball);
        tennis = findViewById(R.id.tennis);
        all_sports = new Button[]{football, tennis, baseball, basketball};
        status_foot = 0;
        status_base = 0;
        status_bask = 0;
        status_ten = 0;

    }

    public void onClickHome(View view) {
        Intent intent = new Intent(this, Explore.class);
        startActivity(intent);
    }



    public void onClickSave(View view){
        Context context = getApplicationContext();
        CharSequence text = "Saved!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void onClickProfile(View view) {
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }

    public void onClickReset(View view) {
        for (int i = 0;i<all_sports.length;i++) {
            all_sports[i].setBackgroundResource(R.drawable.hobbies_buttons);
        }
    }

    public void onBackButton(View view) {
        Intent intent = new Intent(this, Explore.class);
        startActivity(intent);
    }

    public void onClickMenu(View view){
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }

    public void selectedFootball(View view){
        view.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //toggle picture
                if (status_foot == 1) {
                    view.setBackgroundResource(R.drawable.hobbies_buttons);
                    status_foot=0 ;
                }

                else {
                    view.setBackgroundResource(R.drawable.selected_button);
                    status_foot =1;
                }
            }

        });
    }

    public void selectedBask(View view){
        view.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //toggle picture
                if (status_bask == 1) {
                    view.setBackgroundResource(R.drawable.hobbies_buttons);
                    status_bask=0 ;
                }

                else {
                    view.setBackgroundResource(R.drawable.selected_button);
                    status_bask=1;
                }
            }

        });
    }

    public void selectedBase(View view){
        view.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //toggle picture
                if (status_base == 1) {
                    view.setBackgroundResource(R.drawable.hobbies_buttons);
                    status_base=0 ;
                }

                else {
                    view.setBackgroundResource(R.drawable.selected_button);
                    status_base =1;
                }
            }

        });
    }

    public void selectedTennis(View view){
        view.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //toggle picture
                if (status_ten == 1) {
                    view.setBackgroundResource(R.drawable.hobbies_buttons);
                    status_ten=0 ;
                }

                else {
                    view.setBackgroundResource(R.drawable.selected_button);
                    status_ten=1;
                }
            }

        });
    }

}