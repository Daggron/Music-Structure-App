package com.example.musicplayer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class songAdapter extends ArrayAdapter<songs> {


    private static final String LOG_TAG = songAdapter.class.getSimpleName();

    public songAdapter(Activity context, ArrayList<songs> songs) {

        super(context, 0, songs);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View GridItemView = convertView;
        if(GridItemView == null) {
           GridItemView = LayoutInflater.from(getContext()).inflate(R.layout.music_cover, parent, false);
        }


        songs currentSongs = getItem(position);


        TextView nameTextView = (TextView) GridItemView.findViewById(R.id.ArtistName);

        nameTextView.setText(currentSongs.getmArtist());


        TextView numberTextView = (TextView) GridItemView.findViewById(R.id.TrackName);

        numberTextView.setText(currentSongs.getmSong());


        ImageView imageView = (ImageView) GridItemView.findViewById(R.id.Album_cover);
        imageView.setImageResource(currentSongs.getmAlbum_cover());


        return GridItemView;
    }
}
