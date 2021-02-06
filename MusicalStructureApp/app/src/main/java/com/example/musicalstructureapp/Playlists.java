package com.example.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;

import java.io.Serializable;
import java.util.ArrayList;

public class Playlists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_list);

        ArrayList<String> playLists = new ArrayList<String>();
        playLists.add("Playlist 1");
        playLists.add("Playlist 2");
        playLists.add("Playlist 3");
        playLists.add("Playlist 4");
        playLists.add("Playlist 5");
        playLists.add("Playlist 6");
        playLists.add("Playlist 7");
        playLists.add("Playlist 8");
        playLists.add("Playlist 9");
        playLists.add("Playlist 10");

        ArrayAdapter<String> itemAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, playLists);

        GridView songsList = findViewById(R.id.album_list);
        songsList.setAdapter(itemAdapter);

        Button playButton = findViewById(R.id.play_button);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent playButtonIntent = new Intent(Playlists.this, PlaylistPlaying.class);
                //Intent playButtonIntent2 = new Intent(LikedTracks.this, Following.class);


                playButtonIntent.putExtra("Playlist", (Serializable) playLists);
                //playButtonIntent2.putExtra("Song", (Serializable)songs);
                startActivity(playButtonIntent);

            }
        });


    }
}