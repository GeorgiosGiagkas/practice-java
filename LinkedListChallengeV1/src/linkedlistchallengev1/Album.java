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
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs= new ArrayList<Song>();
        
    }

    private boolean songExists (String title){
        ListIterator<Song> iterator = this.songs.listIterator();
        while(iterator.hasNext()){            
            if(iterator.next().getTitle().equals(title)){
                return true;
            }
        }
        return false;
    }
    public boolean songExists (Song song){
        return songExists(song.getTitle());   
    }
    
    public boolean addSongToAlbum(Song song){
        if(!songExists(song.getTitle())){
            this.songs.add(song);
            return true;
        }
        else{
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
        return songs;
    }
    
    public boolean addToPlayList(LinkedList<Song> playList,Song song){   
        if(songExists(song)){
            playList.add(song);
            return true;
        }
        return false;
    }
    
}
