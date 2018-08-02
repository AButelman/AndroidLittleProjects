package com.example.andres.petbioandy;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView cat;
    private ImageView dog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cat = (ImageView) findViewById(R.id.cat);
        dog = (ImageView) findViewById(R.id.dog);

        cat.setOnClickListener(this);
        dog.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.cat:
                Intent catIntent = new Intent(MainActivity.this, SecondActivity.class);
                catIntent.putExtra("name", "Michimiau");
                catIntent.putExtra("bio", "He is a great cat, but sometimes does bad things");
                startActivity(catIntent);
                break;
            case R.id.dog:
                Intent dogIntent = new Intent(MainActivity.this, SecondActivity.class);
                dogIntent.putExtra("name", "Ramón");
                dogIntent.putExtra("bio", "A man's best friend");
                startActivity(dogIntent);
                break;
        }
    }
}
