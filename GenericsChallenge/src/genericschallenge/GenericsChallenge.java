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
public class GenericsChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FootBallTeam f1 = new FootBallTeam("Ajax", 10);
        FootBallTeam f2 = new FootBallTeam("Barchellona", 3);
        FootBallTeam f3 = new FootBallTeam("Real", 7);
        FootBallTeam f4 = new FootBallTeam("Liverpool", 3);
        
        BasketBallTeam b1 = new BasketBallTeam("Macabi", 3);
        BasketBallTeam b2 = new BasketBallTeam("Olympiakos", 10);
        BasketBallTeam b3 = new BasketBallTeam("Real", 9);
        BasketBallTeam b4 = new BasketBallTeam("Pao", 6);
        
        League<FootBallTeam> lf = new League<>();
        lf.addTeamToLeague(f1);
        lf.addTeamToLeague(f2);
        lf.addTeamToLeague(f3);
        lf.addTeamToLeague(f4);
        lf.printLeaderBoard();
        
        League<BasketBallTeam> lb = new League<>();
        lb.addTeamToLeague(b1);
        lb.addTeamToLeague(b2);
        lb.addTeamToLeague(b3);
        lb.addTeamToLeague(b4);
        lb.addTeamToLeague(b4);
        
        lb.printLeaderBoard();
        
    }
    
}
