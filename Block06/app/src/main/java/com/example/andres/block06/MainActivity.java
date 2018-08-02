package com.example.andres.block06;

import android.graphics.Color;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    private ImageView imageLarge;
    private ImageView imageSmall;
    private SeekBar bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageLarge = (ImageView) findViewById(R.id.imageViewLarge);
        imageSmall = (ImageView) findViewById(R.id.imageViewSmall);
        bar = (SeekBar) findViewById(R.id.seekBar_tuner);

        imageLarge.setImageResource(R.drawable.ying);
        imageSmall.setImageResource(R.drawable.ying);

        bar.setProgress(128);
        imageLarge.setColorFilter(Color.argb(255, 0, 0, 0));

        bar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                double a = i-128;
                if (a<0) {a = 0;}
                a = a * 1.8;
                int ae = (int) a;

                double c = 128-i;
                if (c<0) {c = 0;}
                c = c * 1.8;
                int ce = (int) c;

                imageLarge.setColorFilter(Color.argb(255, ae, 0, ce));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
