package com.example.android.msapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ElectroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        Button backListButton = (Button) findViewById(R.id.back_list_button);
        TextView currentActivityView = (TextView) findViewById(R.id.activity_name);
        String activity = this.getClass().getSimpleName().replace("Activity"," songs");
        currentActivityView.setText(activity);
        ArrayList<Song> songs = new ArrayList<>();

        songs.add(new Song("tune1electro", "artist1electro"));
        songs.add(new Song("tune2electro", "artist2electro"));
        songs.add(new Song("tune3electro", "artist3electro"));
        songs.add(new Song("tune4electro", "artist4electro"));
        songs.add(new Song("tune5electro", "artist5electro"));
        songs.add(new Song("tune6electro", "artist6electro"));
        songs.add(new Song("tune7electro", "artist7electro"));
        songs.add(new Song("tune8electro", "artist8electro"));
        songs.add(new Song("tune9electro", "artist9electro"));
        songs.add(new Song("tune10electro", "artist10electro"));

        SongAdapter adapter = new SongAdapter(this, songs);
        final ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Song play_song = (Song) listView.getItemAtPosition(position);
                String item_tune = play_song.getArtistName()+"  "+play_song.getSongName();
                Intent playIntent = new Intent(ElectroActivity.this, PlaySongActivity.class);
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