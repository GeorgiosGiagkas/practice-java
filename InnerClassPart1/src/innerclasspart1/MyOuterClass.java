/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innerclasspart1;

/**
 *
 * @author giagkas
 * 
 * This is an public class that contains an inner class. Inner class is nested non-static class
 * Inner class has access to private members of outer class. If the inner class has same name for
 * member variables as the outer class then the inner class member variables shadows the outer class
 * members. This is called shadowing (not recommended as it causes confusion).
 * Outer class must be instantiated! 
 * 
 * Outer Class private member are visible to inner class!!!
 * 
 * Good programming practice is to make inner class private(encapsulation).
 * In this example, it is public.
 * 
 */
public class MyOuterClass {
    private int x;
    private MyInnerClass myInnerClass;
    
    public MyOuterClass(int x){
        this.x=x;
        this.myInnerClass=new MyInnerClass();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
        
    }

    public MyInnerClass getMyInnerClass() {
        return myInnerClass;
    }

    public void setMyInnerClass(MyInnerClass myInnerClass) {
        this.myInnerClass = myInnerClass;
    }

    
    
    

    //inner class declaration
    public class MyInnerClass{
        private int y;
        
        public MyInnerClass(){
            this(0);
        }
        
        public MyInnerClass(int y){//constructonr
        this.y=y;
        
    }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
        
        public void changeOuterClass(int x){
            MyOuterClass.this.x=x;
        }

      
        
    }
    
}
