package com.example.andres.activitieslifecicle;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends Activity {

    private Button botonVamos;
//Ciclo de vida de la Activity

    // Cuando arranca
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Log.d("First", " onCreate");
        Toast.makeText(FirstActivity.this, "First onCreate", Toast.LENGTH_SHORT).show();

        botonVamos = findViewById(R.id.button);

        botonVamos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                startActivity(intent); //Salta a la segunda Activity
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("First", " onStart");
        Toast.makeText(FirstActivity.this, "First onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("First", " onResume");
        Toast.makeText(FirstActivity.this, "First onResume", Toast.LENGTH_SHORT).show();
    }

    // Cuando para
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("First", " onPause");
        Toast.makeText(FirstActivity.this, "First onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("First", " onStop");
        Toast.makeText(FirstActivity.this, "First onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("First", " onDestroy");
        Toast.makeText(FirstActivity.this, "First onDestroy", Toast.LENGTH_SHORT).show();
    }

}
