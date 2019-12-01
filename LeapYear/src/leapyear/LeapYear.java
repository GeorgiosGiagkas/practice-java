/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leapyear;

import com.sun.javafx.css.SizeUnits;

/**
 *
 * @author giagkas
 */
public class LeapYear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("is leap year: "+isLeapYear(-1600));
        System.out.println("is leap year: "+isLeapYear(1600));
        System.out.println("is leap year: "+isLeapYear(2017));
        System.out.println("is leap year: "+isLeapYear(2000));
        
    }
    
    public static boolean isLeapYear(int year){
        if(year<1 || year>9999){
            return false;
        }
        else if(year%4==0 && (year%400==0 || year%100!=0)){
            return true;
        }
        else{
            return false;
        }
    }
    
}
