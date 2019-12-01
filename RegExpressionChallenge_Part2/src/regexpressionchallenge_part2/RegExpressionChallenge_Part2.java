/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regexpressionchallenge_part2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author giagkas
 */
public class RegExpressionChallenge_Part2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String challenge8 = "abcd.135uvqz.7tzik.999";
        String challenge9="abcd.135\tuvqz.7\ttzik.999\n";
        //Pattern pattern = Pattern.compile("[\\d]+");
        Pattern pattern = Pattern.compile("[a-zA-Z]+\\.(\\d+)\\s");
        //Matcher matcher = pattern.matcher(challenge8);
        Matcher matcher = pattern.matcher(challenge9);
        
        while(matcher.find()){
            System.out.println(matcher.group(1));
        }
        
        matcher.reset();
        
        while(matcher.find()){
            System.out.println("Start :"+matcher.start(1)+" End :"+ (matcher.end(1)-1));
        }
        
        
        String challenge11 = "{0,2},{0,5},{1,3},{2,4}";
        Pattern graphPattern = Pattern.compile("\\{(.+?)\\}");//? converts to lazy quantifier (will not stop to the first }
        Matcher graphMatcher = graphPattern.matcher(challenge11);
        
        while(graphMatcher.find()){
            System.out.println(graphMatcher.group(1));
        }
        
        
        String challenge12 = "11111";
        System.out.println(challenge12.matches("^\\d{5}$"));
        
        String challenge13 = "11111-1111";
        System.out.println(challenge13.matches("^\\d{5}-\\d{4}$"));
        
        String regex="^\\d{5}(-\\d{4})?$";
        System.out.println(challenge12.matches(regex));
        System.out.println(challenge13.matches(regex));
    }
    
}
