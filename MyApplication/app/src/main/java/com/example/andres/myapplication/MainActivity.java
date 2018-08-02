package com.example.andres.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView queres;
    private Button boton;
    private CheckBox mama;
    private CheckBox papa;
    private CheckBox bobe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        queres = (TextView) findViewById(R.id.textView);
        boton = (Button) findViewById(R.id.button);
        mama = (CheckBox) findViewById(R.id.checkBox);
        papa = (CheckBox) findViewById(R.id.checkBox2);
        bobe = (CheckBox) findViewById(R.id.checkBox3);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Mamá", String.valueOf(mama.isChecked()));
                Log.d("Papá", String.valueOf(papa.isChecked()));
                Log.d("Bobe", String.valueOf(bobe.isChecked()));
                StringBuilder stringBuilder = new StringBuilder();
            }
        });





    }
}
