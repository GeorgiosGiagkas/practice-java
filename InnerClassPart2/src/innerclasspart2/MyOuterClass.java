/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innerclasspart2;

/**
 *
 * @author giagkas
 * 
 * inner class can be inner local class
 * Example: We can write local class inside a method.
 * It can only be instantiated inside the method
 */
public class MyOuterClass {
    
    private int x;
    
    public MyOuterClass(){//constructor with default
        this(0);//calling master constructor
    }

    //master constructor
    public MyOuterClass(int x) {
        this.x=x;
    }
    
    
    //local class inside method
    public void myMethod(int x){
        
        //declare Class Summary
        class Summary{
            private int y;
            public Summary(int y){
                this.y=y;
            }
            public void sumN(){
                System.out.println("Summary: "+this.y);
            }
        }
        //instansiate inner local class
        
        Summary mySummary = new Summary(x);
        //mySummary.y;//??? private?
        mySummary.sumN();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "MyOuterClass{" + "x=" + x + '}';
    }
    
    
    
}
