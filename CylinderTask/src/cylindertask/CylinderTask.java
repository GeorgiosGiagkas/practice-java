/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cylindertask;

/**
 *
 * @author giagkas
 */
public class CylinderTask {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circle circle = new Circle(3.75);
        System.out.println("radius: "+ circle.getRadius());
        System.out.println("area: "+ circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("radius: "+cylinder.getRadius());
        System.out.println("area: "+cylinder.getArea());
        System.out.println("height: "+cylinder.getHeight());
        System.out.println("vol: "+cylinder.getVolume());
    }
    
}
