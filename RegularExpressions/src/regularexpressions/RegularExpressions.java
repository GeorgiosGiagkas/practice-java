/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author giagkas
 */
public class RegularExpressions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String myString = "I am the One!";
        String newString = myString.replaceAll("I", "You");
        System.out.println(newString);
        //dot for all characters
        System.out.println(myString.replaceAll(".","0"));
        //^ boundary macth character. must matche the begining of string, (only the start.
        System.out.println(myString.replaceAll("^I am","You are"));
        System.out.println(myString.replaceAll("^One","Two"));//not the beggining of string!!
        
        //the whole string must match the regexp to return true!!!
        System.out.println(myString.matches("^I"));
        System.out.println(myString.matches("I am the One!"));
        
        //$ boundary match character. The end must match
        System.out.println(myString.replaceAll("One!$","Two!"));
        
        //[]: each charater in brackets
        System.out.println(myString.replaceAll("[te]", "X"));
        //replace if followd by the contents of the second brackets
        System.out.println(myString.replaceAll("[e][ ]", "X"));//??
        
        
        System.out.println("harry".replaceAll("[Hh]arry","Barry"));
        
        
        String alphanumeric = "starta7pdjAWjknvk1@231/ kk1oks9END";
        
        //[^ ] inside brackets is a character class not a boundary matcher. 'Other than'
        
        System.out.println(alphanumeric.replaceAll("[^A]", "X"));
        
        //- range  inclusive
        System.out.println(alphanumeric.replaceAll("[a-k1-3]", "X"));
        
        //(?i) ingonre case sensitivity
        System.out.println(alphanumeric.replaceAll("(?i)[a-e]", "X"));
        
        //all digits
        System.out.println(alphanumeric.replaceAll("[0-9]", "X"));
        //or with \\d
        System.out.println(alphanumeric.replaceAll("\\d", "X"));
        
        //all NON-digits with \\D
        System.out.println(alphanumeric.replaceAll("\\D", "X"));
        
        //whitespaces with \\s
        String whitespace = "I have spaces and\ttabs and new line\n";
        System.out.println(whitespace.replaceAll("\\s", ""));
        //all non whitespaces \\S
        System.out.println(alphanumeric.replaceAll("\\S", ""));
        
        //[a-zA-z0-9_] is \\w
        System.out.println(whitespace.replaceAll("\\w", "X"));
        
        
        //each words is surrounded with a replacement string. with \\b
        System.out.println(whitespace.replaceAll("\\b", "X"));
        
        
        //quantifiers
        String myString2 = "aaAA00011111_jfsoq ndjwiBaBaa0909END";
        System.out.println(myString2);
        //character{2} 
        System.out.println(myString2.replaceAll("^aaA{2}", "X"));
        //or if we do not care how many times
        System.out.println(myString2.replaceAll("^aaA+", "X"));
        System.out.println(myString2.replaceAll("^aaA{1,}", "X"));
        //0 or more times
        System.out.println(myString2.replace("^aaA*", "X"));//??
        System.out.println(myString2.replace("^aaA{0,}", "X"));//??
        
        //Matchers and Patterns
        StringBuilder htmlText = new StringBuilder();
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>My paragraph</p>");
        htmlText.append("<h2>Summary</h2>");
        
        System.out.println(htmlText);
        String test = ".*<h2>.*";
        Pattern pattern = Pattern.compile(test);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());
        
        
        
        String test2 = "<h2>";
        Pattern pattern2 = Pattern.compile(test2);
        Matcher matcher2 = pattern2.matcher(htmlText);
       
        //matcher reseet
        //matcher2.reset();
        int count=0;
        while(matcher2.find()){
            count++;
            System.out.println("Occurance:"+count+"\tStart:"+matcher2.start()+"\tEnd:"+matcher2.end());
        }
        
        
        //Groups () : we have 1 group
        String h2GroupPattern = "(<h2>.*?</h2>)";//* is a reluctant quantifier. place ? to do it lazy quantifier.It stops at first occurance
        Pattern groupPattern = Pattern.compile(h2GroupPattern);
        Matcher groupMatcher = groupPattern.matcher(htmlText);
        System.out.println(groupMatcher.matches());
        
        groupMatcher.reset();
        while(groupMatcher.find()){
            System.out.println("Occurance: "+groupMatcher.group());
        }
        
        // 3 groups
        String h2TextGroup = "(<h2>)(.*?)(</h2>)";
        Pattern textGroupPattern = Pattern.compile(h2TextGroup);
        Matcher textGroupMatcher = textGroupPattern.matcher(htmlText);
        System.out.println(textGroupMatcher.matches());
        
        textGroupMatcher.reset();
        while(textGroupMatcher.find()){
            System.out.println("Occurance: "+textGroupMatcher.group(2));//returns String that matches the 2nd group (.*?)
        }
        
        
        
        //or
        String visa1 = "4444444444444"; // should match
        String visa2 = "5444444444444"; // shouldn't match
        String visa3 = "4444444444444444";  // should match
        String visa4 = "4444";  // shouldn't match

        System.out.println("visa1 " + visa1.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("visa2 " + visa2.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("visa3 " + visa3.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("visa4 " + visa4.matches("^4[0-9]{12}([0-9]{3})?$"));
    }
    
}
