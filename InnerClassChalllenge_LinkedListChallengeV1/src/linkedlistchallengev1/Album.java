/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistchallengev1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author giagkas
 */
public class Album {

    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();

    }

    private class SongList {

        private ArrayList<Song> songsInner;

        public SongList() {
            this.songsInner = new ArrayList<Song>();
        }

        public boolean songExists(String title) {
            ListIterator<Song> iterator = this.songsInner.listIterator();
            while (iterator.hasNext()) {
                if (iterator.next().getTitle().equals(title)) {
                    return true;
                }
            }
            return false;
        }

        public ArrayList<Song> getSongsInner() {
            return songsInner;
        }
        
        public void addSong(Song song){
            songsInner.add(song);
        }


    }

    public boolean songExists(Song song) {
        return songs.songExists(song.getTitle());
    }

    public boolean addSongToAlbum(Song song) {
        if (!songs.songExists(song.getTitle())) {
            this.songs.addSong(song);
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public ArrayList<Song> getSongs() {
        return songs.getSongsInner();
    }

    public boolean addToPlayList(LinkedList<Song> playList, Song song) {
        if (songExists(song)) {
            playList.add(song);
            return true;
        }
        return false;
    }

}
