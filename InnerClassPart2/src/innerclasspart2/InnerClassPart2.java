/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innerclasspart2;

/**
 *
 * @author giagkas
 */

//abstract class
abstract class MyAnonymousClass{
    abstract void myPrint();
}

interface AnonymousAble{
    void myPrint();
}


public class InnerClassPart2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //inner local class
        MyOuterClass ocl = new MyOuterClass(20);
        System.out.println(ocl);
        ocl.myMethod(30);
        
        
        
        /**
         * Inner class can be Anonymous.It is instantiated as it is declared.
         * Implements an interface or abstract class
         * Example: to handle buttons
         */
        
        MyAnonymousClass myAnonymous = new MyAnonymousClass()
        {  
        @Override
        public  void myPrint()
        {
            System.out.println("This is an anonymous class method call!");
        }
    };
        
        myAnonymous.myPrint();
        
        
        //Interfaced cannot be instansiated. In the case below, an object is created
        //from an anonymous class that implements an interface(AnonymousAble)
        AnonymousAble myAA = new AnonymousAble() {
            @Override
            public void myPrint() {
                System.out.println("Class instantiated at the time of creation");
            }
        };
        
        myAA.myPrint();
    
}
}
    

