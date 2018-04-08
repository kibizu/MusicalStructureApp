package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.android.musicalstructureapp.databinding.ActivityPlaylistBinding;

/**
 * Created by Massimiliano on 01/03/2018.
 */

public class PlaylistActivity extends AppCompatActivity{

    private Toolbar toolbar;
    private ActivityPlaylistBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_playlist);

        binding.morningPlaylist.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                Intent favoriteTracksIntent = new Intent(PlaylistActivity.this, MorningActivity.class);
                startActivity(favoriteTracksIntent);

            }

        });

        binding.eveningPlaylist.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                Intent favoriteTracksIntent = new Intent(PlaylistActivity.this, EveningActivity.class);
                startActivity(favoriteTracksIntent);

            }

        });
        initToolBar();

    }

    public void initToolBar(){

        toolbar = binding.toolBar.tbar;
        toolbar.setTitle(R.string.playlist);
        toolbar.setTitleTextColor(getResources().getColor(R.color.text_color));
        toolbar.setBackgroundColor(getResources().getColor(R.color.tan_background));
        toolbar.setTitleMargin(0    ,0,0,0);

        setSupportActionBar(toolbar);

        // Get a support ActionBar corresponding to this toolbar
        ActionBar ab = getSupportActionBar();

        // Enable the Up button
        ab.setDisplayHomeAsUpEnabled(true);

    }

}
