/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondsminuteschallenge;

/**
 *
 * @author giagkas
 */
public class SecondsMinutesChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(getDurationString(3600));
        System.out.println(getDurationString(60));
        System.out.println(getDurationString(360));
        System.out.println(getDurationString(-360));
        System.out.println(getDurationString(60, 60));
        System.out.println(getDurationString(0, 6));
        System.out.println(getDurationString(600, 59));
        System.out.println(getDurationString(600, -60));
        System.out.println(getDurationString(-600, 20));
    }
    
    //method 
    public static String getDurationString(long minutes , long seconds){
        if(minutes<0 || seconds<0 || seconds>59){
            return "Invalid Value";
        }
        
        long hours = minutes/60;
        long remainingMinutes= minutes%60;
        return hours+" h "+remainingMinutes+"m "+seconds+"s";
        
    }
    
    //method overloading//must have same name and different number or types of parameters.
    //may or may have not different return type. It does not matter
    private static String getDurationString(long seconds){
        if(seconds<0){
            return "Invalid value!";
        }
        long minutes = seconds/60;
        long remainingSeconds = seconds%60;
        String x = getDurationString(minutes, remainingSeconds);//method call!
        return x;
    }
}
