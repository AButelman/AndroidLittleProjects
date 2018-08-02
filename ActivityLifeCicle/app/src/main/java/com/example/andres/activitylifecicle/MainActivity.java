package com.example.andres.activitylifecicle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("on", "Start");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("on", "reStart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("on", "reSume");
    }
    @Override
    protected void onPause() {
        Log.i("on", "Pause");
        super.onPause();
    }
    @Override
    protected void onStop() {
        Log.i("on", "reStop");
        super.onStop();
    }
    @Override

    Intent intent = new Intent(this, SecondActivity.class);



    protected void onDestroy() {
        Log.i("on", "reDestroy");
        super.onDestroy();
    }
}
