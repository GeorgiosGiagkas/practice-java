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
public class Printer {

    private double tonerLevel;
    private int numPages;
    private boolean duplex;
    private boolean power = false;

    public Printer(double tonerLevel, int numPages) {//constructor with default argument for duplex
        this(tonerLevel, numPages, false);//calling major constructor
    }

    public Printer(double tonerLevel, int numPages, boolean duplex) {//major constructor
        if (tonerLevel < 0) {
            this.tonerLevel = 0.0;
        } else if (tonerLevel > 100.0) {
            this.tonerLevel = 100.0;
        } else {
            this.tonerLevel = tonerLevel;
        }
        if (numPages < 0) {
            this.numPages = 0;
        } else if (numPages > 200) {
            this.numPages = 200;
        } else {
            this.numPages = numPages;
        }

        this.duplex = duplex;
    }

    public void fillUpToner(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid value!");
        } else if (this.tonerLevel == 100.0) {
            System.out.println("Printer toner level is already max!");
        } else {
            System.out.println("Toner level is " + this.tonerLevel + "%.");
            if (this.tonerLevel + amount > 100.0) {
                this.tonerLevel = 100.0;
                System.out.println("Printer toner level has been maxed!");
            } else {
                this.tonerLevel += amount;
                System.out.println("Printer toner level filled up to " + this.tonerLevel + "%.");
            }
        }
    }

    public void printPages(int amount) {

        if (this.power) {
            if (this.duplex && amount > 0) {
                for (int i = 1; i <= amount; i++) {
                    if (canPrintPage()) {
                        System.out.println("Printing page " + i);
                        this.numPages--;
                        this.tonerLevel--;
                    }
                    else{
                        System.out.println("Cannot print! Run out of pages or toner!");
                    }
                }
            }
            else if (!this.duplex && amount > 0) {
                for (int i = 1; i <= amount; i++) {
                    if (canPrintPage()) {
                        System.out.println("Printing page " + i);
                        this.numPages-=2;
                        this.tonerLevel--;
                    }
                    else{
                        System.out.println("Cannot print! Run out of pages or toner!");
                    }
                }
            }
            else{
                System.out.println("Invalid amount!");
            }

        }
        else{
            System.out.println("Power is off!");
        }
    }

    private boolean canPrintPage() {
        if (this.numPages > 1 && this.tonerLevel > 1.0 && this.duplex) {
            return true;
        }
        else if(this.numPages > 2 && this.tonerLevel > 1.0 && (!this.duplex)){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean setPower(boolean set) {
        if (set) {
            System.out.println("Power is on.");
            this.power = true;
            return true;
        } else {
            System.out.println("Power is off. Cannot print any more. Switch the power on");
            this.power = false;
            return false;
        }
    }

}
