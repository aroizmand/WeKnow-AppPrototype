package com.example.weknow;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class Outdoors extends AppCompatActivity {
    int status_hik,status_fish,status_for,status_clim;
    Button[] all_hobbies;
    Button hiking;
    Button fishing;
    Button foraging;
    Button climbing;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outdoors);
        status_clim = 0;
        status_fish=0;
        status_for=0;
        status_hik=0;
        hiking = findViewById(R.id.hiking);
        fishing = findViewById(R.id.fishing);
        foraging = findViewById(R.id.foraging);
        climbing = findViewById(R.id.climbing);
        all_hobbies=new Button[]{hiking,fishing,foraging,climbing};
    }

    public void onClickHome(View view) {
        Intent intent = new Intent(this, Explore.class);
        startActivity(intent);
    }


    public void onClickSave(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Saved!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }

    public void onBackButton(View view) {
        Intent intent = new Intent(this, Explore.class);
        startActivity(intent);
    }




    public void onClickProfile(View view) {
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }

    public void onClickReset(View view) {

        for (int i = 0;i<all_hobbies.length;i++) {
            all_hobbies[i].setBackgroundResource(R.drawable.hobbies_buttons);
        }
    }

    public void onClickMenu(View view){
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
    public void selectedHik(View view){
        view.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //toggle picture
                if (status_hik == 0) {
                    view.setBackgroundResource(R.drawable.selected_button);
                    status_hik=1 ;
                }

                else {
                    view.setBackgroundResource(R.drawable.hobbies_buttons);
                    status_hik =0;
                }
            }
        });
    }

    public void selectedFis(View view){
        view.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //toggle picture
                if (status_fish == 0) {
                    view.setBackgroundResource(R.drawable.selected_button);
                    status_fish=1 ;
                }

                else {
                    view.setBackgroundResource(R.drawable.hobbies_buttons);
                    status_fish =0;
                }
            }
        });
    }

    public void selectedFor(View view){
        view.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //toggle picture
                if (status_for == 0) {
                    view.setBackgroundResource(R.drawable.selected_button);
                    status_for=1 ;
                }

                else {
                    view.setBackgroundResource(R.drawable.hobbies_buttons);
                    status_for =0;
                }
            }
        });
    }

    public void selectedCli(View view){
        view.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //toggle picture
                if (status_clim == 0) {
                    view.setBackgroundResource(R.drawable.selected_button);
                    status_clim=1 ;
                }

                else {
                    view.setBackgroundResource(R.drawable.hobbies_buttons);
                    status_clim =0;
                }
            }
        });
    }


}