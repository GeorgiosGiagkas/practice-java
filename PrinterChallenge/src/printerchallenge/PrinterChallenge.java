/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printerchallenge;

/**
 *
 * @author giagkas
 */
public class PrinterChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Printer printer = new Printer(50, 10);
        printer.fillUpToner(-10);
        printer.fillUpToner(10);
        printer.fillUpToner(100);
        
        printer.printPages(10);
        
        printer.setPower(true);
        printer.printPages(10);
        printer.setPower(false);
        
    }
    
}
