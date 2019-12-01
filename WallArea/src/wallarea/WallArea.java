/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wallarea;

/**
 *
 * @author giagkas
 */
public class WallArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Wall wall = new Wall(10,10);
        System.out.println(wall.getArea());
    }
    
}
