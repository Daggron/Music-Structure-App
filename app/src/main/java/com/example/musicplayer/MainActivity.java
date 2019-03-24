package com.example.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static final String KEY_SONG = "KEY_SONG";
    public static final String KEY_ARTIST = "KEY_ARTIST";
    public static final String KEY_ALBUM = "KEY_ALBUM";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<songs> allSongs = new ArrayList<songs>();

        allSongs.add(new songs("Eminem","when i am Gone",R.drawable.eminem));

        allSongs.add(new songs("Eminem","Kamikaze",R.drawable.kamikaze));

        allSongs.add(new songs("Imagine Dragons","What Ever It Takes",R.drawable.imaginedragons));

        allSongs.add(new songs("David Guetta","Titanium",R.drawable.tittanium));

        allSongs.add(new songs("Linkin Park","CAstle of Glass",R.drawable.linkinpark));

        allSongs.add(new songs("Linkin Park","In The End",R.drawable.intheend));


       final songAdapter adapter = new songAdapter(this,allSongs);

        GridView gridView = (GridView) findViewById(R.id.gridview);
        gridView.setAdapter(adapter);



        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                songs item = (songs) adapter.getItem(position);
                Intent nowPlaying = new Intent(getApplicationContext(), NowPlaying.class);
                nowPlaying.putExtra(KEY_SONG, item.getmSong());
                nowPlaying.putExtra(KEY_ARTIST, item.getmArtist());
                nowPlaying.putExtra(KEY_ALBUM,item.AlbumCover());

                startActivity(nowPlaying);
            }
        });

    }


}
