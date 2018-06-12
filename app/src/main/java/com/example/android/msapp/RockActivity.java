package com.example.android.msapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class RockActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        Button backListButton = (Button) findViewById(R.id.back_list_button);

        ArrayList<Song> songs = new ArrayList<>();

        songs.add(new Song("tune1rock", "artist1rock"));
        songs.add(new Song("tune2rock", "artist2rock"));
        songs.add(new Song("tune3rock", "artist3rock"));
        songs.add(new Song("tune4rock", "artist4rock"));
        songs.add(new Song("tune5rock", "artist5rock"));
        songs.add(new Song("tune6rock", "artist6rock"));
        songs.add(new Song("tune7rock", "artist7rock"));
        songs.add(new Song("tune8rock", "artist8rock"));
        songs.add(new Song("tune9rock", "artist9rock"));
        songs.add(new Song("tune10rock", "artist10rock"));

        SongAdapter adapter = new SongAdapter(this, songs);
        final ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Song play_song = (Song) listView.getItemAtPosition(position);
                String item_tune = play_song.getArtistName()+"  "+play_song.getSongName();
                Intent playIntent = new Intent(RockActivity.this, PlaySongActivity.class);
                playIntent.putExtra("item",item_tune);
                startActivity(playIntent);
            }
        });
        backListButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the backListButton is clicked on.
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
