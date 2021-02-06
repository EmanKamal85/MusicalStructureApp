package com.example.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

import java.io.Serializable;
import java.util.ArrayList;

public class PodCasts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_list);

        ArrayList<Song> podCasts = new ArrayList<Song>();
        podCasts.add(new Song("Album 1", "Artist 1"," "));
        podCasts.add(new Song("Album 2", "Artist 2"," "));
        podCasts.add(new Song("Album 3", "Artist 3"," "));
        podCasts.add(new Song("Album 4", "Artist 4"," "));
        podCasts.add(new Song("Album 5", "Artist 5", " "));
        podCasts.add(new Song("Album 6", "Artist 6"," "));
        podCasts.add(new Song("Album 7", "Artist 7", " "));
        podCasts.add(new Song("Album 8", "Artist 8"," "));
        podCasts.add(new Song("Album 9", "Artist 9"," "));
        podCasts.add(new Song("Album 10", "Artist 10"," "));

       SongAdapter itemAdapter = new SongAdapter(this,podCasts);

        GridView podCastList = findViewById(R.id.album_list);
        podCastList.setAdapter(itemAdapter);

        Button playButton=findViewById(R.id.play_button);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent playButtonIntent = new Intent(PodCasts.this, PodCastPlaying.class);
                //Intent playButtonIntent2 = new Intent(LikedTracks.this, Following.class);


                playButtonIntent.putExtra("PodCasts", (Serializable)podCasts);
                //playButtonIntent2.putExtra("Song", (Serializable)songs);
                startActivity(playButtonIntent);

            }
        });

    }
}