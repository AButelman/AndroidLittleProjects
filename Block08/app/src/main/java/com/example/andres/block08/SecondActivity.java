package com.example.andres.block08;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        texto = (TextView) findViewById(R.id.textView);

        Intent caller = getIntent();
        int rating = caller.getIntExtra("rating", 0);

        switch (rating){
            case (0):
                texto.setText("¿Tan mal, como para un " + String.valueOf(rating) + "?");
                break;
            case (1):
                texto.setText("Al menos un " + String.valueOf(rating) + " es más que nada");
                break;
            case (2):
                texto.setText("Ok, ponele que " + rating + " es maso");
                break;
            case (3):
                texto.setText("Está bastante bien un " + rating + " ¿no?");
                break;
            case (4):
                texto.setText("¡Un " + rating + ", gracias!");
                break;
            case (5):
                texto.setText("¡Que bueno que te encantó la película!");
                break;
        }

    }
}
