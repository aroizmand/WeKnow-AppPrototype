package com.example.weknow;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Media extends AppCompatActivity {

    Button film, photo, writing, acting;
    Button[] all_media;
    int status_film,status_photo,status_act,status_wri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media);
        film = findViewById(R.id.film);
        photo = findViewById(R.id.photograpy);
        writing = findViewById(R.id.writing);
        acting = findViewById(R.id.acting);
        all_media = new Button[]{film,photo,writing,acting};
        status_film = 0;
        status_act=0;
        status_photo=0;
        status_wri=0;
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

    public void onClickReset(View view){
        for (int i = 0;i<all_media.length;i++) {
            all_media[i].setBackgroundResource(R.drawable.hobbies_buttons);
        }
    }

    public void onClickProfile(View view) {
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }

    public void onClickMenu(View view) {
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);

    }

    public void onBackButton(View view) {
        Intent intent = new Intent(this, Explore.class);
        startActivity(intent);

    }

    public void selectedFilm(View view){
        view.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //toggle picture
                if (status_film == 0) {
                    view.setBackgroundResource(R.drawable.selected_button);
                    status_film=1 ;
                }

                else {
                    view.setBackgroundResource(R.drawable.hobbies_buttons);
                    status_film=0;
                }
            }
        });
    }

    public void selectedWrit(View view){
        view.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //toggle picture
                if (status_wri == 0) {
                    view.setBackgroundResource(R.drawable.selected_button);
                    status_wri=1 ;
                }

                else {
                    view.setBackgroundResource(R.drawable.hobbies_buttons);
                    status_wri =0;
                }
            }
        });
    }

    public void selectedPhot(View view){
        view.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //toggle picture
                if (status_photo == 0) {
                    view.setBackgroundResource(R.drawable.selected_button);
                    status_photo=1 ;
                }

                else {
                    view.setBackgroundResource(R.drawable.hobbies_buttons);
                    status_photo =0;
                }
            }
        });
    }

    public void selectedAct(View view){
        view.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //toggle picture
                if (status_act == 0) {
                    view.setBackgroundResource(R.drawable.selected_button);
                    status_act=1 ;
                }

                else {
                    view.setBackgroundResource(R.drawable.hobbies_buttons);
                    status_act=0;
                }
            }
        });
    }

}
