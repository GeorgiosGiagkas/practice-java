/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclasschallenge;

/**
 *
 * @author giagkas
 */
public abstract class MyList {
    protected MyList previousItem=null;
    protected MyList nextItem=null;
    protected Object myObject;

    public MyList(Object myObject){
        this.myObject=myObject;
    }
    
    public abstract  MyList moveToNextItem();
    
    public abstract MyList moveToPreviousItem(); 
    
    public abstract MyList setPreviousItem(MyList previousItem);
        
    public abstract MyList setNextItem(MyList nextItem);
    
    

    public abstract int myCompareTo(MyList myList);
    
    
    
    public Object getMyObject() {
        return myObject;
    }

    public void setMyObject(Object myObject) {
        this.myObject = myObject;
    }
    
    
      
    
    
    
    
}
