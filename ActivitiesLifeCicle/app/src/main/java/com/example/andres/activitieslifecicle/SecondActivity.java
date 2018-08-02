package com.example.andres.activitieslifecicle;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends Activity {

    private Button botonVolvemos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);Log.d("Second", " onCreate");
        Toast.makeText(SecondActivity.this, "Second onCreate", Toast.LENGTH_SHORT).show();
        botonVolvemos = (Button) findViewById(R.id.button2);

        botonVolvemos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SecondActivity.this, FirstActivity.class)); //Volvemos
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Second", " onStart");
        Toast.makeText(SecondActivity.this, "Second onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Second", " onResume");
        Toast.makeText(SecondActivity.this, "Second onResume", Toast.LENGTH_SHORT).show();
    }

    // Cuando para
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Second", " onPause");
        Toast.makeText(SecondActivity.this, "Second onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Second", " onStop");
        Toast.makeText(SecondActivity.this, "Second onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Second", " onDestroy");
        Toast.makeText(SecondActivity.this, "Second onDestroy", Toast.LENGTH_SHORT).show();
    }

}
