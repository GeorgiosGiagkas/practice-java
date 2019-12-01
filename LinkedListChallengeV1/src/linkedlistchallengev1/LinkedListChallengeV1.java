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
import java.util.Scanner;

/**
 *
 * @author giagkas
 */
public class LinkedListChallengeV1 {

    /**
     * @param args the command line arguments
     */
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        
        Song song1= new  Song("We'll burn the sky!", 6.25);
        Song song2= new  Song("Fly to the rainbow!", 8.30);
        Album album1 = new Album("Tokyo Tapes", "Scorpions");
        
        Song song3= new Song("Cast away your chains", 4.50);
        Song song4= new Song ("Earthquake",7.30);
        Song song5= new Song("Chaplin and I",4.40);
        
        Album album2 = new Album("Electric Sun","Uli roth");
        
        album1.addSongToAlbum(song1);
        album1.addSongToAlbum(song2);
        album2.addSongToAlbum(song3);
        album2.addSongToAlbum(song4);
        album2.addSongToAlbum(song5);
        
        ArrayList<Album> albums = new ArrayList<Album>();
        albums.add(album1);
        albums.add(album2);
        
        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList(playList, song2);
        albums.get(1).addToPlayList(playList, song5);
        
        play(playList);
        
        
    }
    public static void play(LinkedList<Song> playList){
        ListIterator<Song> iterator = playList.listIterator();
        if(playList==null){
            System.out.println("Playlist is empty.");
            return;
        }
        else{
            System.out.println("Now playing: "+iterator.next());
        }
        
        
        boolean goingForward = true;
        boolean quit = false;
        printMenu();
        
        while(!quit){
            boolean hasNextInt= scanner.hasNextInt();
            if(!hasNextInt){
                scanner.nextLine();
                System.out.println("Invalid value!");
                continue;
            }
            
            int userInput= scanner.nextInt();
            scanner.nextLine();
            
            
            
            switch(userInput){
                case 0:
                    System.out.println("Quit program....");
                    quit=true;
                    break;
                case 1:
                    System.out.println("Skipping forward...");
                    if(!goingForward){
                        if(iterator.hasNext()){
                            iterator.next();
                        }
                        goingForward=true;
                    }
                    
                    if(iterator.hasNext()){
                        System.out.println("Now playing: "+iterator.next().toString());
                    }
                    else{
                        System.out.println("You reached the end of the list!");
                        goingForward=false;
                    }
                    break;
                case 2:
                    System.out.println("Skipping backward...");
                    if(goingForward){
                        if(iterator.hasPrevious()){
                            iterator.previous();
                        }
                        goingForward=false;
                    }
                    
                    if(iterator.hasPrevious()){
                        System.out.println("Now playing: "+iterator.previous());
                        
                    }
                    else{
                        System.out.println("Reached the start of the list");
                        goingForward=true;
                    }

                    break;
                    
                case 3:
                 
                    if(goingForward){
                        if(iterator.hasPrevious()){
                            System.out.println("Replaying: "+iterator.previous());
                            goingForward=false;
                        }
                        else{
                            System.out.println("You are at the start of the list!");
                        }
                    }
                    else{
                        if(iterator.hasNext()){
                            System.out.println("Replaying: "+iterator.next());
                            goingForward=true;
                        }
                        else{
                            System.out.println("You are at the end of the list!");
                        }
                        
                    }
                    break;
                case 4:
                    printPlayList(playList);
                    break;
                case 5:
                    if(playList.size()>0){
                        iterator.remove();
                        System.out.println("Removing current song....");
                        if(iterator.hasNext()){
                            System.out.println("Now playing: "+iterator.next());
                        }
                        else if(iterator.hasPrevious()){
                            System.out.println("Now playing: "+iterator.previous());
                        }
                    }
                    break;
                case 6:
                    printMenu();
                    break;
                default:
                    System.out.println("Invalid action.");
                    break;
                    
            }
            
            
        }
    }
    
    private static void printMenu(){
        System.out.println("============================");
        System.out.println("Press:\n"+
                "0\tTo quit.\n"+
                "1\tTo skip forward.\n"+
                "2\tTo skip backward.\n"+
                "3\tTo replay current song.\n"+
                "4\tTo print playlist.\n"+
                "5\tTo remove song from playlist.\n"+
                "6\tTo print menu");
        System.out.println("============================");
    }
    private static void printPlayList(LinkedList<Song> playList){
        Iterator<Song> iterator = playList.iterator();
        System.out.println("============================");
        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
        System.out.println("============================");
    }
    
    
}
