/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericschallenge;

/**
 *
 * @author giagkas
 */
public abstract class Team implements Comparable<Team>{
    private String name;
    private int position;
    private int numberOfPlayers;

    public Team(String name, int position, int numberOfPlayers) {
        this.name = name;
        this.position = position;
        this.numberOfPlayers = numberOfPlayers;
    }

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    @Override
    public int compareTo(Team o) {
        return this.position-o.position;
    }

    @Override
    public String toString() {
        return "Team{" + "name=" + name + ", position=" + position + ", numberOfPlayers=" + numberOfPlayers + '}';
    }


    
  
    
}
