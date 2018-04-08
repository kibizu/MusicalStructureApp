package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import com.example.android.musicalstructureapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);


        binding.tracksEFavorite.localTracks.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                Intent localTracksIntent = new Intent(MainActivity.this, LocalTracksActivity.class);
                startActivity(localTracksIntent);

            }

        });

        binding.tracksEFavorite.favoriteTracks.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                Intent favoriteTracksIntent = new Intent(MainActivity.this, FavoriteActivity.class);
                startActivity(favoriteTracksIntent);

            }

        });

        binding.playlistERecent.playlist.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                Intent playlistIntent = new Intent(MainActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);

            }

        });

        binding.playlistERecent.recentTracks.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                Intent recentTracksIntent = new Intent(MainActivity.this, RecentActivity.class);
                startActivity(recentTracksIntent);

            }

        });


        initToolBar();
    }

    public void initToolBar(){

        toolbar = binding.toolBar.tbar;
        toolbar.setTitle(R.string.my_tracks);
        toolbar.setTitleTextColor(getResources().getColor(R.color.text_color));
        toolbar.setBackgroundColor(getResources().getColor(R.color.tan_background));
        toolbar.setTitleMargin(0    ,0,0,0);

        setSupportActionBar(toolbar);

    }

}