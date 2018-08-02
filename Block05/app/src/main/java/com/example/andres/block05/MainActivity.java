package com.example.andres.block05;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final View fondo = findViewById(R.id.fondo);

        RadioGroup grupo = (RadioGroup) findViewById(R.id.radioGroup);

        // Crea un archivo XML con referencias Key/Value llamado COLOR_PREF.XML que sea privado de la app
        SharedPreferences preferences = getSharedPreferences("COLOR_PREF", Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = preferences.edit();

        // Si en el archivo hay una llave "colorId"
        if (preferences.contains("colorId")){
            // Leela su valor y pasala como fondo
            fondo.setBackgroundColor(preferences.getInt("colorId", 0));
        }

        grupo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                int colorCode = 0;
                switch (i) {
                    case (R.id.radioButtonBlue):
                        colorCode = Color.BLUE;
                        break;
                    case (R.id.radioButtonMagenta):
                        colorCode = Color.MAGENTA;
                        break;
                    case (R.id.radioButtonYellow):
                        colorCode = Color.YELLOW;
                        break;
                }
                fondo.setBackgroundColor(colorCode);

        // Guarda el código de color bajo la llave colorId en el archivo COLOR_PREF.XML
                editor.putInt("colorId", colorCode);
                editor.commit();
            }
        });


    }
}
