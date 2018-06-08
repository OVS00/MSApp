package com.example.android.msapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter {

    public SongAdapter(Context context, ArrayList p) {
        super(context,0, p);
    }

    @Override
    public View  getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_view, parent, false);
        }
        Song current_song= (Song) getItem(position);
        TextView artistNameTextView = (TextView) listItemView.findViewById(R.id.artist_name);
        artistNameTextView.setText(current_song.getSongName());
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.song_name);
        defaultTextView.setText(current_song.getArtistName());

        return listItemView;
    }
}