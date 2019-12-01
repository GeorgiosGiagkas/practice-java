/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysumellipsis;

/**
 *
 * @author giagkas
 */
public class MySumEllipsis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Result: "+ mySum(1));
        System.out.println("Result: "+ mySum(1,2));
        System.out.println("Result: "+ mySum(1,2,3));
        System.out.println("Result: "+ mySum(1,2,-1,0,100,200));
        System.out.println("Result: "+ mySum(1.2,1.50,1,50));
        System.out.println("Result: "+ mySum(1.2,1.50));
        System.out.println("Result: "+ mySum(2,1));
    }
    
    public static long mySum(int...args){//ellipsis
        long sumA=0;
        for(int i : args){//i takes the value of args for each iteration
            sumA+=i;
        }
        return sumA;
    }
    //method overloading. Same method name, different type of parameters. (different return type-optional)
    public static double mySum(double...args){
        double sumA=0;
        for(double i : args){
            sumA+=i;
        }
        return sumA;
    }
}
