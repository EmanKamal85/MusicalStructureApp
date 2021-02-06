package com.example.musicalstructureapp;

import java.io.Serializable;

public class Song implements Serializable {
    private String songName;
    private String singer;
    private String duration;

    Song(String songName, String singer, String duration) {
        this.songName = songName;
        this.singer = singer;
        this.duration = duration;
    }

    public String getSongName() {
        return songName;
    }

    public String getSinger() {
        return singer;
    }

    public String getDuration() {
        return duration;
    }

}
