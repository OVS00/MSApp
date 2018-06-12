package com.example.android.msapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class ClassicalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        Button backListButton = (Button) findViewById(R.id.back_list_button);

        ArrayList<Song> songs = new ArrayList<>();

        songs.add(new Song("tune1classical", "artist1classical"));
        songs.add(new Song("tune2classical", "artist2classical"));
        songs.add(new Song("tune3classical", "artist3classical"));
        songs.add(new Song("tune4classical", "artist4classical"));
        songs.add(new Song("tune5classical", "artist5classical"));
        songs.add(new Song("tune6classical", "artist6classical"));
        songs.add(new Song("tune7classical", "artist7classical"));
        songs.add(new Song("tune8classical", "artist8classical"));
        songs.add(new Song("tune9classical", "artist9classical"));
        songs.add(new Song("tune10classical", "artist10classical"));

        SongAdapter adapter = new SongAdapter(this, songs);
        final ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Song play_song = (Song) listView.getItemAtPosition(position);
                String item_tune = play_song.getArtistName()+"  "+play_song.getSongName();
                Intent playIntent = new Intent(ClassicalActivity.this, PlaySongActivity.class);
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