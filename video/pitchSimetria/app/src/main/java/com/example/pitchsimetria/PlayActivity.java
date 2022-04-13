package com.example.pitchsimetria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.SeekBar;
import android.widget.VideoView;

public class PlayActivity extends AppCompatActivity {
    SeekBar seekBar;

    AudioManager audioManager;

    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        videoView = findViewById(R.id.videoView);

        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.simetria);

        videoView.start();

        videoView.setMediaController(new MediaController(this));

        //volume

        seekBar = findViewById(R.id.seekBarVolume);

        audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

        //volume max
        int max = audioManager.getStreamMaxVolume(audioManager.STREAM_MUSIC);

        int curVolume = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);

        seekBar.setMax(max);

        seekBar.setProgress(curVolume);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, progress,0);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        //getSupportActionBar().hide();

        //View decorView = getWindow().getDecorView();

        //int op = View.SCROLL_AXIS_VERTICAL;
        //decorView.setSystemUiVisibility(op);
    }
}