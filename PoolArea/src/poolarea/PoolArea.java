/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poolarea;

/**
 *
 * @author giagkas
 */
public class PoolArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle rectAngle = new Rectangle(5, 10);
        System.out.println("Area Rect: "+ rectAngle.getArea());
        
        Cuboid cuboid = new Cuboid(5, 10, 5);
        System.out.println("Area Cuboid: "+ cuboid.getArea());
        System.out.println("Volume Cuboid: "+ cuboid.getVolume());
        
        
    }
    
}
