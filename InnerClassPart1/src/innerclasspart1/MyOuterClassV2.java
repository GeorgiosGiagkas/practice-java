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
 * Outer class has not access of private members of inner class
 * Private inner class is generally recommended.
 * Private class is instantiated inside the OuterClass
 */
public class MyOuterClassV2 {
    private int x;
    private MyInnerClassV2 myInnerClass;
    
    public MyOuterClassV2(int x){
        this.x=x;
        this.myInnerClass= new MyInnerClassV2(0);
        
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

   
    public int getY(){
        return this.myInnerClass.getY();
    }
    
    public void setY(int x){
        this.myInnerClass.setY(x);
        
    }

    @Override
    public String toString() {
        return "MyOuterClassV2{" + "x=" + x + ", myInnerClass=" + myInnerClass + '}';
    }

    
    private class MyInnerClassV2{
        private int y;
        
        public MyInnerClassV2(int y){
            this.y=y;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        @Override
        public String toString() {
            return "MyInnerClassV2{" + "y=" + y + '}';
        }
        
        
    }
}
