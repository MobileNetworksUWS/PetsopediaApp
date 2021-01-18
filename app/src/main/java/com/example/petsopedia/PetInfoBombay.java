package com.example.petsopedia;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PetInfoBombay extends AppCompatActivity {

    LinearLayout playlistview;
    ImageView backbutton;
    ImageView playPauseIcon;
    TextView startTime;
    TextView duration;
    SeekBar seekBar;
    MediaPlayer mediaPlayer;
    int totalLength;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.petsopedia);
        getSupportActionBar().setTitle("");

        setContentView(R.layout.pet_info_bombay);
        playPauseIcon = findViewById(R.id.playpauseicon);

        playlistview = (LinearLayout) findViewById(R.id.playlistlistview);

        mediaPlayer = new MediaPlayer();
        mediaPlayer = MediaPlayer.create(this, R.raw.catsound);

        mediaPlayer.seekTo(0);
        totalLength = mediaPlayer.getDuration();

        playPauseIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.pause();
                    playPauseIcon.setImageResource(R.drawable.play);
                } else {
                    mediaPlayer.start();
                    playPauseIcon.setImageResource(R.drawable.pause);
                }
            }
        });

        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

            public void onCompletion(MediaPlayer mp) {
                playPauseIcon.setImageResource(R.drawable.play);
            }
        });

        seekBar = findViewById(R.id.seekBar);
        seekBar.setMax(totalLength);
        seekBar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar thisSeekBar, int progress, boolean fromUser) {
                        if (fromUser) {
                            mediaPlayer.seekTo(progress);
                            thisSeekBar.setProgress(progress);
                        }
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar thisSeekBar) {
                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar thisSeekBar) {
                    }
                }
        );

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (mediaPlayer != null) {
                    try {
                        Message msg = new Message();
                        msg.what = mediaPlayer.getCurrentPosition();
                        handler.sendMessage(msg);
                        Thread.sleep(1000);
                    } catch (InterruptedException ignored) {
                    }
                }
            }
        }).start();

        backbutton = (ImageView) findViewById(R.id.backPetInfo);
        backbutton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent intent = new Intent(PetInfoBombay.this, Cats.class);

                startActivity(intent);
            }
        });


    }

    private Handler handler = new Handler(new Handler.Callback() {
        @Override
        public boolean handleMessage(Message msg) {
            int currentPosition = msg.what;
            seekBar.setProgress(currentPosition);
            startTime = findViewById(R.id.startTime);
            duration = findViewById(R.id.texttotal);

            String elapsedTime = createTimeLabel(currentPosition);
            startTime.setText(elapsedTime);

            String remainingTime = "- " + createTimeLabel(totalLength - currentPosition);
            duration.setText(remainingTime);

            return true;
        }
    });

    public String createTimeLabel(int time) {
        String timeLabel = "";
        int min = time / 1000 / 60;
        int sec = time / 1000 % 60;

        timeLabel = min + ":";
        if (sec < 10) timeLabel += "0";
        timeLabel += sec;

        return timeLabel;
    }
}
