package com.example.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;

public class LikedTracks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_list);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("All I Ask", "Adelle", "4.03"));
        songs.add(new Song("Perfect ", "Ed Shaaran", "5.03"));
        songs.add(new Song("Animals", "Maroon5", "3.70"));
        songs.add(new Song("Beautiful Goodbye", "Maroon5", "4.70"));
        songs.add(new Song("First Love", "Adelle", "4.70"));
        songs.add(new Song("At Last", "Beyonce", "5.00"));
        songs.add(new Song("Aura", "Lady Gaga", "4.00"));
        songs.add(new Song("Applause", "Lady Gaga", "4.67"));
        songs.add(new Song("We Be Burnin", "Sean Paul ", "3.80"));
        songs.add(new Song("My Last", "Big Sean ", "3.80"));

        SongAdapter itemAdapter = new SongAdapter(this, songs);

        ListView songsList = findViewById(R.id.song_list);
        songsList.setAdapter(itemAdapter);

        Button playButton = findViewById(R.id.play_button);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent playButtonIntent = new Intent(LikedTracks.this, NowPlaying.class);
                //Intent playButtonIntent2 = new Intent(LikedTracks.this, Following.class);


                playButtonIntent.putExtra("Song", (Serializable) songs);
                //playButtonIntent2.putExtra("Song", (Serializable)songs);
                startActivity(playButtonIntent);

            }
        });


    }

}