package com.example.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);


        ArrayList<Song> songList;
        songList = (ArrayList<Song>) getIntent().getExtras().getSerializable("Song");


        TextView nowPlaying1=findViewById(R.id.now_playing_text_view_1);
        TextView nowPlaying2=findViewById(R.id.now_playing_text_view_2);
        TextView nowPlaying3=findViewById(R.id.now_playing_text_view_3);

        Handler handler = new Handler();

        for (int i=0; i<songList.size(); i++) {
            int finalI = i;
            handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
            nowPlaying1.setText(songList.get(finalI).getSongName());
            nowPlaying2.setText(songList.get(finalI).getSinger());
            nowPlaying3.setText(songList.get(finalI).getDuration());
                        }
                    }, 5000*i);

        }




    }
}