package com.example.android.msapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class EthnicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<>();

        songs.add(new Song("tune1et", "artist1et"));
        songs.add(new Song("tune2et", "artist2et"));
        songs.add(new Song("tune3et", "artist3et"));

        SongAdapter adapter = new SongAdapter(this, songs);
        final ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Song play_song = (Song) listView.getItemAtPosition(position);
                String item_tune = play_song.getArtistName()+"  "+play_song.getSongName();
                Intent playIntent = new Intent(EthnicActivity.this, PlaySongActivity.class);
                playIntent.putExtra("item",item_tune);
                startActivity(playIntent);


            }
        });
    }
}