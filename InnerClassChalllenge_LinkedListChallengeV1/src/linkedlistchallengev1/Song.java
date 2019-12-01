/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistchallengev1;

/**
 *
 * @author giagkas
 */
public class Song {
    private String title;
    private double duration;

    
    public Song(String title, double duration){
        this.title=title;
        this.duration=duration;
    }

    public String getTitle() {
        return title;
    }


    public double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Song{" + "title=" + title + ", duration=" + duration + '}';
    }


    
    
}
