package com.example.musicplayer;

public class songs {
   private   String mArtist;
   private   String mSong;
   private int mAlbum_cover;
   private String Album_Cover;

    songs(String artist,String song,int id){
        mArtist=artist.toUpperCase();
        mSong=song.toUpperCase();
        mAlbum_cover=id;
        Album_Cover=Integer.toString(id);
    }

    public String getmArtist(){
        return mArtist;
    }


    public  String getmSong(){
        return mSong;
    }

    public int getmAlbum_cover(){
       return mAlbum_cover;
    }

    public String AlbumCover(){
        return Album_Cover;
    }

}
