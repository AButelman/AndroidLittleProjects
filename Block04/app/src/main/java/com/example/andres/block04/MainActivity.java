package com.example.andres.block04;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button botonPlay;
    private Button botonPause;
    private Switch switchLoop;
    private MediaPlayer musica;
    private SeekBar volumen;
    private TextView cuantoVol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonPlay = (Button) findViewById(R.id.play);
        botonPause = (Button) findViewById(R.id.pause);
        switchLoop = (Switch) findViewById(R.id.loop);
        volumen = (SeekBar) findViewById(R.id.volumenID);
        cuantoVol = (TextView) findViewById(R.id.cuanVol);

        // Asigno al objeto MediaPlayer el tema a tocar
        musica = MediaPlayer.create(this, R.raw.back);

        volumen.setProgress(50);
        cuantoVol.setText(String.valueOf(volumen.getProgress()));

        volumen.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                cuantoVol.setText(String.valueOf(seekBar.getProgress()));
                float vol = Float.valueOf(seekBar.getProgress());
                vol = (vol / 100.0f);
                musica.setVolume(vol, vol);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }});
        switchLoop.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                musica.setLooping(b);
            }
        });

        botonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                musica.start();
            }
        });

        botonPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (musica.isPlaying()) {
                    musica.pause();
                }
            }
        });
    }
}
