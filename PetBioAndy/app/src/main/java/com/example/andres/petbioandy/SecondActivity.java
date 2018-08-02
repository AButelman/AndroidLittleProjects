package com.example.andres.petbioandy;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private ImageView image;
    private TextView name;
    private TextView bio;
    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        image = (ImageView) findViewById(R.id.imageId);
        name = (TextView) findViewById(R.id.nameId);
        bio = (TextView) findViewById(R.id.bioId);

        extras = getIntent().getExtras();

        if (extras != null) {
            String name = extras.getString("name");
            String bio = extras.getString("bio");
            setUp(name, bio);
        }

    }

    public void setUp(String nameArg, String bioArg){
        if (nameArg.equals("Michimiau")){
            image.setImageDrawable(getResources().getDrawable(R.drawable.icon_lg_cat));
            name.setText(nameArg);
            bio.setText(bioArg);
        } else if (nameArg.equals("Ramón")){
            image.setImageDrawable(getResources().getDrawable(R.drawable.icon_lg_dog));
            name.setText(nameArg);
            bio.setText(bioArg);
        }
    }
}
