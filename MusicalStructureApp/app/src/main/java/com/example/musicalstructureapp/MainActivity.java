package com.example.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout playlistsLayout = findViewById(R.id.playlist_layout);
        playlistsLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playlistIntent = new Intent(MainActivity.this, Playlists.class);
                startActivity(playlistIntent);

            }
        });

        LinearLayout likedTracksLayout = findViewById(R.id.liked_trackes_layout);
        likedTracksLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent likedTracksIntent = new Intent(MainActivity.this, LikedTracks.class);
                startActivity(likedTracksIntent);
            }
        });

        LinearLayout albumsLayout = findViewById(R.id.albums_layout);
        albumsLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent albumsIntent = new Intent(MainActivity.this, PodCasts.class);
                startActivity(albumsIntent);
            }
        });


    }
}