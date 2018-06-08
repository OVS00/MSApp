package com.example.android.msapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

public class PlaySongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_song);
        TextView textView = (TextView) findViewById(R.id.item_name);
        Intent intent = getIntent();
        String item_tune = intent.getExtras().getString("item");
        textView.setText(item_tune);


    }
}
