package com.example.musicalstructureapp;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class PodCastPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);
        ArrayList<Song> podCastList;
        podCastList = (ArrayList<Song>) getIntent().getExtras().getSerializable("PodCasts");


        TextView nowPlaying1 = findViewById(R.id.now_playing_text_view_1);
        TextView nowPlaying2 = findViewById(R.id.now_playing_text_view_2);
        TextView nowPlaying3 = findViewById(R.id.now_playing_text_view_3);

        Handler handler = new Handler();

        for (int i = 0; i < podCastList.size(); i++) {
            int finalI = i;
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    nowPlaying1.setText(podCastList.get(finalI).getSongName());
                    nowPlaying2.setText(podCastList.get(finalI).getSinger());
                    nowPlaying3.setText(podCastList.get(finalI).getDuration());
                }
            }, 5000 * i);

        }

    }
}