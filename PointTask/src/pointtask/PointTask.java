/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pointtask;

/**
 *
 * @author giagkas
 */
public class PointTask {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Point first = new Point(6,5);
        Point second = new Point(3,1);
        
        System.out.println("distance(0,0) = "+ first.distance());
        System.out.println("distance(second) = "+ first.distance(second));
        System.out.println("distance(2,2) = "+ first.distance(2,2));
        
    }
    
}
