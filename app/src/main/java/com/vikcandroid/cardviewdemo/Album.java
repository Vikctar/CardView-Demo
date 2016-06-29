package com.vikcandroid.cardviewdemo;

/**
 * This is a model class denoting the album properties like name, number of songs
 * and cover image.
 * Created by curv3r on 6/30/16.
 */
public class Album {
    // instance variables
    private String name;
    private int numOfSongs;
    private int thumbnail;

    // default empty constructor
    public Album() {
    }

    // constructor with fields as params
    public Album(String name, int numOfSongs, int thumbnail) {
        this.name = name;
        this.numOfSongs = numOfSongs;
        this.thumbnail = thumbnail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfSongs() {
        return numOfSongs;
    }

    public void setNumOfSongs(int numOfSongs) {
        this.numOfSongs = numOfSongs;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
