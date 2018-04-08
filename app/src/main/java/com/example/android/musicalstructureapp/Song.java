package com.example.android.musicalstructureapp;

/**
 * Created by Massimiliano on 02/03/2018.
 */

public class Song {

    /**The title of the song*/
    private String mSongTitle;

    /**The artist of the song*/
    private String mSongArtist;

    /**Audio resource ID for the song*/
    private int mAudioResourceId;

    /** Constant value that represents no artist was provided for this song */
    private static final String NO_ARTIST_PROVIDED = null;

    /**
     * Create a song Word object.
     *
     * @param songTitle this is the title of the song
     *
     *
     */
    public Song(String songTitle, int audioResourceId) {
        mSongTitle = songTitle;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Create a song Word object.
     *
     * @param songTitle this is the title of the song
     *
     * @param songArtist this is the Artis of the song
     *
     */
    public Song(String songTitle, String songArtist, int audioResourceId) {
        mSongTitle = songTitle;
        mSongArtist = songArtist;
        mAudioResourceId = audioResourceId;
    }



    @Override
    public String toString() {
        return "Song{" +
                "mSongTitle='" + mSongTitle + '\'' +
                ", mSongArtis='" + mSongArtist + '\'' +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }

    /*
    /**Get the title of the song
     */
    public String getmSongTitle() {
        return mSongTitle;
    }

    /*
    /**Get the artist of the song
     */
    public String getmSongArtist() {
        return mSongArtist;
    }

    /**
     * Return the audio resource ID of the song.
     */
    public int getmAudioResourceId() {
        return mAudioResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasArtist() {
        return mSongArtist != NO_ARTIST_PROVIDED;
    }

}
