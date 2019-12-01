/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masterchallengelect50;

/**
 *
 * @author giagkas
 */
public class Deluxe extends BasicHam {

    public Deluxe() {
        super("Deluxe", "White", "Beacon", 15.0);
        super.setHamAdd1("chips", 1.8);
        super.setHamAdd2("cola", 2.0);
    }

    @Override
    public void setHamAdd4(String addition4, double priceAdd4) {
        System.out.println("Cannot add to a deluxe!");
    }

    @Override
    public void setHamAdd3(String addition3, double priceAdd3) {
        System.out.println("Cannot add to a deluxe!");
    }

    @Override
    public void setHamAdd2(String addition2, double priceAdd2) {
        System.out.println("Cannot add to a deluxe!");
    }

    @Override
    public void setHamAdd1(String addition1, double priceAdd1) {
        System.out.println("Cannot add to a deluxe!");
    }

}
