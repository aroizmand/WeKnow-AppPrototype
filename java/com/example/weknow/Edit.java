package com.example.weknow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Edit extends AppCompatActivity {
    EditText name;
    EditText description;
    EditText link;
    Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        name = findViewById(R.id.name);
        description=findViewById(R.id.description1);
        link = findViewById(R.id.link);
        bundle = getIntent().getExtras();
        if(bundle!=null){
            name.setText(bundle.getString("current_name"));
            description.setText(bundle.getString("current_description"));
            link.setText(bundle.getString("current_link"));
        }
    }

    public void OnclickSave(View view){
        Intent intent = new Intent(this, Profile.class);
        Bundle b = new Bundle();
        b.putString("new_name",name.getText().toString());
        b.putString("new_description",description.getText().toString());
        b.putString("new_link",link.getText().toString());
        Context context = getApplicationContext();
        CharSequence text = "Saved!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        intent.putExtras(b);
        startActivity(intent);
    }

    public void onClickMenu(View view){
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }

    public void onClickReset(View view){
        name.setText(bundle.getString("current_name"));
        description.setText(bundle.getString("current_description"));
        link.setText(bundle.getString("current_link"));
    }
}