package com.example.android.musicalstructureapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;



import java.util.ArrayList;

/**
 * Created by Massimiliano on 02/03/2018.
 */

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter (Activity context , ArrayList<Song> songs){

        super(context, 0,songs);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.song_list_item, parent, false);
        }
        // Get the {@link Song} object located at this position in the list
        Song currentSong = getItem(position);

        //Get the title of the song from the current Song object and
        //set this text on the song title TextView
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);
        titleTextView.setText(currentSong.getmSongTitle());

        //Get the artist of the song from the current Song object and
        //set this text on the song artist TextView

        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);
        if (currentSong.hasArtist()) {

            artistTextView.setText(currentSong.getmSongArtist());
        } else {

            artistTextView.setText(R.string.unkown_artist);
        }

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
