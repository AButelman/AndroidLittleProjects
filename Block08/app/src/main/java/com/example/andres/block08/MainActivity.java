package com.example.andres.block08;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RatingBar estrellas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        estrellas = (RatingBar) findViewById(R.id.ratingBar);

        estrellas.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Intent segunda = new Intent();
                segunda.setClass(getApplicationContext(), SecondActivity.class);

                segunda.putExtra("rating", (int) v);
                startActivity(segunda);
                finish();

                // Toast.makeText(getApplication(), String.valueOf((int) v), Toast.LENGTH_LONG).show();
            }
        });
    }
}
