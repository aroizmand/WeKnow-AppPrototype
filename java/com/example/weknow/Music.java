package com.example.weknow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Music extends AppCompatActivity {
    Button guitar, violin, piano, saxo;
    Button[] all_hobbies;
    int status_guitar,status_violin,status_piano,status_saxo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        violin = findViewById(R.id.violin);
        guitar = findViewById(R.id.guitar);
        piano = findViewById(R.id.piano);
        saxo = findViewById(R.id.saxo);
        status_violin =0;
        status_guitar = 0;
        status_piano = 0;
        status_saxo = 0;
        all_hobbies = new Button[]{guitar, piano, violin, saxo};
        SharedPreferences preferences = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        status_violin = preferences.getInt("statusV",0);
        status_saxo = preferences.getInt("statusS", 0);
        status_guitar = preferences.getInt("statusG", 0);
        status_piano = preferences.getInt("statusP", 0);
        if (status_saxo==1)
            saxo.setBackgroundResource(R.drawable.selected_button);

        if (status_guitar==1)
            guitar.setBackgroundResource(R.drawable.selected_button);

        if (status_piano==1)
            piano.setBackgroundResource(R.drawable.selected_button);

        if (status_violin==1)
            violin.setBackgroundResource(R.drawable.selected_button);
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





    public void onClickProfile(View view) {
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }

    public void onBackButton(View view) {
        Intent intent = new Intent(this, Explore.class);
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

    public void selected_guitar(View view){
        view.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //toggle picture
                if (status_guitar == 0) {
                    view.setBackgroundResource(R.drawable.selected_button);
                    status_guitar=1 ;
                }

                else {
                    view.setBackgroundResource(R.drawable.hobbies_buttons);
                    status_guitar =0;
                }
            }

        });
    }

    public void selected_violin(View view){
        view.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //toggle picture
                if (status_violin == 0) {
                    view.setBackgroundResource(R.drawable.selected_button);
                    status_violin=1 ;
                }

                else {
                    view.setBackgroundResource(R.drawable.hobbies_buttons);
                    status_violin =0;
                }
            }

        });
    }
    public void selected_piano(View view){
        view.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //toggle picture
                if (status_piano == 0) {
                    view.setBackgroundResource(R.drawable.selected_button);
                    status_piano=1 ;
                }

                else {
                    view.setBackgroundResource(R.drawable.hobbies_buttons);
                    status_piano =0;
                }
            }

        });
    }

    public void selected_saxo(View view){
        view.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //toggle picture
                if (status_saxo == 0) {
                    view.setBackgroundResource(R.drawable.selected_button);
                    status_saxo=1 ;
                }

                else {
                    view.setBackgroundResource(R.drawable.hobbies_buttons);
                    status_saxo =0;
                }
            }

        });
    }
}