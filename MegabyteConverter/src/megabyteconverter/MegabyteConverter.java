/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package megabyteconverter;

/**
 *
 * @author giagkas
 */
public class MegabyteConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        printMegabytesAndKiloBytes(0);
        printMegabytesAndKiloBytes(2500);
        printMegabytesAndKiloBytes(5000);
        
    }
    
    public static void printMegabytesAndKiloBytes(int kilobytes){
        if(kilobytes <0){
            System.out.println("Invalid value");
        }
        else{
            int megabytes=kilobytes/1024;
            int remainingKilobytes=kilobytes%1024;
            System.out.println(kilobytes+" KB = "+ megabytes + " MB "+ remainingKilobytes+ " KB");
            
        }
    }
    
}
