package com.example.android.msapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class PlaySongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_song);

        Button top = (Button) findViewById(R.id.top_button_song);
        Button back = (Button) findViewById(R.id.back_button_song);
        Button play =(Button) findViewById(R.id.play_song_button);
        TextView textView = (TextView) findViewById(R.id.item_name);
        Intent intent = getIntent();
        String item_tune = intent.getExtras().getString("item");
        textView.setText(item_tune);

        top.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the top button is clicked on.
            @Override
            public void onClick(View view) {
                Intent mainIntent = new Intent(PlaySongActivity.this, MainActivity.class);
                startActivity(mainIntent);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the back button is clicked on.
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        play.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the play button is clicked on.
            @Override
            public void onClick(View view) {
                String text = "music playing not available";
                int duration = Toast.LENGTH_SHORT;
                Context context = getApplicationContext();
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
    }
}
