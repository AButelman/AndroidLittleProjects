package com.example.andres.convertmilestokm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText milestext;
    private EditText kmtext;
    private Button mtokmbutton;
    private Button kmtombutton;
    double miles;
    double km;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        milestext = (EditText) findViewById(R.id.milesID);
        kmtext = (EditText) findViewById(R.id.kmID);

        mtokmbutton = (Button) findViewById(R.id.mtokmID);
        kmtombutton = (Button) findViewById(R.id.kmtomID);

        mtokmbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (milestext.getText().toString().equals("")) {
                    Toast mostra = Toast.makeText(getApplicationContext(), "Please enter a valid number...", Toast.LENGTH_LONG);
                    mostra.setGravity(Gravity.TOP, 0, 300);
                    mostra.show();
                } else {
                    miles = Double.valueOf(String.valueOf(milestext.getText()));
                    km = miles / 0.62137;
                    kmtext.setText(String.format("%.2f", km));
                }
            }
        });

        kmtombutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (kmtext.getText().toString().equals("")) {
                    Toast mostra = Toast.makeText(getApplicationContext(), "Please enter a valid number...", Toast.LENGTH_LONG);
                    mostra.setGravity(Gravity.TOP, 0, 300);
                    mostra.show();
                } else {
                    km = Double.valueOf(String.valueOf(kmtext.getText()));
                    miles = km * 0.62137;
                    milestext.setText(String.format("%.2f", miles));
                }
            }
        });
    }
}
