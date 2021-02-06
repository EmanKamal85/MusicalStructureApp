package com.example.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaylistPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        ArrayList<String> playList;
        playList = (ArrayList<String>) getIntent().getExtras().getSerializable("Playlist");


        TextView nowPlaying1 = findViewById(R.id.now_playing_text_view_1);
        TextView nowPlaying2 = findViewById(R.id.now_playing_text_view_2);
        TextView nowPlaying3 = findViewById(R.id.now_playing_text_view_3);

        Handler handler = new Handler();

        for (int i = 0; i < playList.size(); i++) {
            int finalI = i;
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    nowPlaying1.setText(playList.get(finalI));
                    nowPlaying2.setText(playList.get(finalI));
                    nowPlaying3.setText(playList.get(finalI));
                }
            }, 5000 * i);

        }

    }
}