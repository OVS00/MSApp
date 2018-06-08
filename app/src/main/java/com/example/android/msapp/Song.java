package com.example.android.msapp;

public class Song {

    private String pSongName;
    private String pArtistName;

    public Song (String songName,String artistName){
        pSongName = songName;
        pArtistName = artistName;
    }
    public String getSongName(){
        return pSongName;
    }
    public String getArtistName(){
        return pArtistName;
    }
}
