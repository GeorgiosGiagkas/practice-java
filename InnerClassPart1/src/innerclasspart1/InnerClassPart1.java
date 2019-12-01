/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innerclasspart1;

/**
 *
 * @author giagkas
 */
public class InnerClassPart1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MyOuterClass oCl= new MyOuterClass(2);
        System.out.println(oCl.getMyInnerClass().getY());
        
        //how to initialize public inner class
        MyOuterClass.MyInnerClass iCl = oCl.new MyInnerClass(7);
        System.out.println(iCl.getY());
        //does not change outer class member value, as they are two different objects. (the one we instantiate, and
        //the other that the Outer class instantiated by the constructor
        System.out.println(oCl.getMyInnerClass().getY());
        
        
        //changes the value of x
        iCl.changeOuterClass(10);
        System.out.println(oCl.getX());
        
        
        /*
        *Private inner class example. Encapsulation!!!
        *
        */
        System.out.println("\n=====================\n");
        MyOuterClassV2 ocl2 = new MyOuterClassV2(10);
        System.out.println(ocl2);
        
        ocl2.setX(999);
        ocl2.setY(666);
        System.out.println(ocl2);
    }
    
}
