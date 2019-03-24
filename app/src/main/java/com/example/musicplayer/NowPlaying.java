package com.example.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.musicplayer.MainActivity.KEY_ALBUM;
import static com.example.musicplayer.MainActivity.KEY_ARTIST;
import static com.example.musicplayer.MainActivity.KEY_SONG;

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        String TrackName="";
        String Artist="";
        String Album="";

        // Gets intent and ListView item data from MainActivity
        Intent intent = getIntent();
        if (intent!=null) {
            TrackName = intent.getStringExtra(KEY_SONG);
            Artist = intent.getStringExtra(KEY_ARTIST);
            Album=intent.getStringExtra(KEY_ALBUM);
        }

        // Sets data to appropriate TextViews
        TextView playingSongArtist = (TextView) findViewById(R.id.ArtistName);
        playingSongArtist.setText(Artist);

        TextView playingTrackName= (TextView) findViewById(R.id.TrackName);
        playingTrackName.setText(TrackName);


        ImageView albumCover = (ImageView) findViewById(R.id.image);
        albumCover.setImageResource(Integer.parseInt(Album));

    }

    boolean play=true;

    public void pause(View view){

        ImageView image = (ImageView) findViewById(R.id.play);

        if(play) {
            image.setImageResource(R.drawable.pause);
            play=false;
        }
        else {
            image.setImageResource(R.drawable.play);
            play=true;
        }

    }
}
