/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericschallenge;


import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author giagkas
 */
public class League<T extends Team> {
    private ArrayList<T> teams;

    public League() {
        this.teams = new ArrayList<>();
    }
    
    public void addTeamToLeague(T team){
        if(teams.contains(team)){
            System.out.println("Cannot add "+team.getName()+" again.");
            return;
        }
        System.out.println("Adding: "+team.getName()+" to league!");
        teams.add(team);
    }
    
    public void printLeaderBoard(){      
        sortByPosition();
        this.teams.forEach((team)->System.out.println(team));
    }
    
    private void sortByPosition(){
        Collections.sort(teams);
        Collections.reverse(teams);
    }
    
}
