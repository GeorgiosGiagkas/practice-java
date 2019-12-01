/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regexpressionchallengepart1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author giagkas
 */
public class RegExpressionChallengePart1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String challenge1 = "I want a bike.";
        
        String regex1 ="^I want a bike.";
        //or      
        //String regex1 ="^I want a bike[\\.]{1}";
        System.out.println(challenge1.matches(regex1));
        
        
        /////////
        String challenge2 = "I want a ball.";
//        String regex2="^I want a \\w+.";
        
       String regex2 = "^I want a (ball|bike).";//OR
       System.out.println(challenge1.matches(regex2));
       System.out.println(challenge2.matches(regex2));
       
       ////
       Pattern pattern = Pattern.compile("^I want a \\w+.");
       Matcher matcher = pattern.matcher(challenge2);
       System.out.println(matcher.matches());
       
       
       //
       String challenge4 = "Replace all blanks with underscores.";
       String regex4="\\s";
       System.out.println(challenge4.replaceAll(regex4, "_"));
        
        
       //
       String challenge5="aaabccccccccdddefffg";
       String regex5="^[a]{3}[b][c]{8}[d]{3}[e][f]{3}[g]$";
       //or better
       String regex6="^a{3}bc{8}d{3}ef{3}g$";
        System.out.println(challenge5.matches(regex5));
        //or less strict
        System.out.println(challenge5.matches("[abcdefg]+"));//+ for 1 or more
        //or
        System.out.println(challenge5.matches("[a-g]*"));//* for 0 or more
       
        
        //
        String challenge7 ="abcd.135";
        String regex="^[a-zA-z]+\\.[0-9]+$";
        System.out.println(challenge7.matches(regex));
    }
    
}
