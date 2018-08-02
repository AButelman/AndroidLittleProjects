package com.example.andres.activities;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class SecondActivity extends Activity {

    private SeekBar seekBar2;
    private TextView text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        seekBar2 = findViewById(R.id.seekBar2);
        text2 = findViewById(R.id.textView2);

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            int number = extras.getInt("number");
            seekBar2.setProgress(number);
            text2.setText(String.valueOf(number));
            text2.setVisibility(View.VISIBLE);
        }

        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                text2.setText(String.valueOf(i));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                int progress = seekBar2.getProgress();
                Intent returnIntent = getIntent();
                returnIntent.putExtra("returnData", progress);
                setResult(RESULT_OK, returnIntent);
                finish();
            }
        });
    }
}
