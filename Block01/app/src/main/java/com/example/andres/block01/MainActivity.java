package com.example.andres.block01;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    private Button botonAzul;
    private Button botonRosa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonAzul = (Button) findViewById(R.id.button_blueInvisible);
        botonRosa = (Button) findViewById(R.id.button_pink);

        botonAzul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                botonAzul.setVisibility(View.INVISIBLE);
            }
        });

       botonRosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "To do, to do, to do...", Toast.LENGTH_LONG).show();
            }
        });

    }
}
